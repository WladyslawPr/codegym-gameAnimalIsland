package com.codegym.Animals.Abstract;

import com.codegym.Animals.plants.Herb;


public interface SeekFood {

    default boolean feedSelf() {
        Herb herb = ((Animal)this).island.hasHerb(((Animal)this).x, ((Animal)this).y); // maybe use static int x, y or island ?
        if (herb != null) {
            herb.decreaseSize(4);
            ((Animal)this).increaseEnergy(10);
            return true;
        } else {
            return false;
        }

    }

    default void seekFood() {

        if (((Animal)this).island.hasHerb(((Animal)this).x, ((Animal)this).y) != null) {
            feedSelf();
        } else {
            ((Animal)this).move(Math.random(), 2);
        }
    }

  /*  default void seekFood() {
        if (island.hasHerb(x, y) != null) {
            ((Animal)this).feedSelf();
            // to move east.
        } else if (island.hasHerb(x + 1, y) != null || island.hasHerb(x + 1, y + 1) != null || island.hasHerb(x + 1, y - 1) != null || island.hasHerb(x + 1, y + 2) != null || island.hasHerb(x + 1, y - 2) != null) {
            move(0.3, 1);
        } else if (island.hasHerb(x + 2, y) != null || island.hasHerb(x + 2, y + 1) != null || island.hasHerb(x + 2, y - 1) != null || island.hasHerb(x + 2, y + 2) != null || island.hasHerb(x + 2, y - 2) != null) {
            move(0.3, 2);

            // to move west.
        } else if (island.hasHerb(x - 1, y) != null || island.hasHerb(x - 1, y + 1) != null || island.hasHerb(x - 1, y - 1) != null || island.hasHerb(x - 1, y + 2) != null || island.hasHerb(x - 1, y - 2) != null) {
            move(0.8, 1);
        } else if (island.hasHerb(x - 2, y) != null || island.hasHerb(x - 2, y + 1) != null || island.hasHerb(x - 2, y - 1) != null || island.hasHerb(x - 2, y + 2) != null || island.hasHerb(x - 2, y - 2) != null) {
            move(0.8, 2);

            // to move north.
        } else if (island.hasHerb(x, y - 1) != null) {
            move(0.1, 1);
        } else if (island.hasHerb(x, y - 2) != null) {
            move(0.1, 2);

            // to move south.
        } else if (island.hasHerb(x, y + 1) != null) {
            move (0.6, 1);
        } else if (island.hasHerb(x, y + 2) != null) {
            move (0.6, 2);

        } else {
            move(Math.random(), 2);
        }
    }

   */

}
