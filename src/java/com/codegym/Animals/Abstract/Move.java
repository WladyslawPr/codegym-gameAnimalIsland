package com.codegym.Animals.Abstract;

import static com.codegym.Animals.Abstract.Animal.*;


public interface Move {

      default void  move(double direction) {
        int distance = (int) (Math.random() * 2);
        move(direction, distance);
     }

      default void move(double direction, int distance) {

        int initX = ((Animal)this).x; // ((Animal)this)
        int initY = ((Animal)this).y; //((Animal)this)

        int newX = initX;
        int newY = initY;

        if (direction < MOVE_NORTH) {
            // north.
            newY = initY - distance;
        } else if (direction < MOVE_EAST) {
            // east.
            newX = initX + distance;
        } else if (direction < MOVE_SOUTH) {
            // south.
            newY = initY + distance;
        } else if (direction < MOVE_WEST) {
            // west.
            newX = initX - distance;
        }

        if (((Animal)this).island != null) {
            int width = ((Animal)this).island.getWidth();
            int height = ((Animal)this).island.getHeight();

            if (newX < 0) {
                newX = width - 1;
            } else if (newX > width - 1) {
                newX = 0;
            }

            if (newY < 0) {
                newY = height - 1;
            } else if (newY > height - 1) {
                newY = 0;
            }
          /*  if (((Animal)this).island.isOccupied(newX, newY)) {
                newX = initX;
                newY = initY;
            }

           */
        }
          ((Animal)this).x = newX;
          ((Animal)this).y = newY;

     }

}
