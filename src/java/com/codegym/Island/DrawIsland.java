package com.codegym.Island;


import com.codegym.Animals.Abstract.*;
import com.codegym.InterfacesGeographical.GeographicalFeature;
import static com.codegym.Island.GenerateAnimalsInIsland.animals;
import static com.codegym.Island.GenerateHerbsInIsland.geographicalFeatures;


public interface DrawIsland {

    default void drawIsland() {

        // draw top border.
        System.out.print('|');
        for (int i = 0; i < ((Island)this).width; i++) {
            System.out.print('-');
        }
        System.out.println('|');

        // draw each row. using y as counter to match coordinate position.
        for (int y = 0; y < ((Island)this).height; y++) {

            // draw left border.
            System.out.print('|');

            // iterate through the columns.
            for (int x = 0; x < ((Island)this).width; x++) {

                // flag whether this position is occupied.
                boolean hasObject = false;

                // loop through all animals to check if position matches.
                for (Animal b : animals) {

                    /* check if animal is in this position. at most one animal will be as we are
                     preventing multiple objects from occupying the same position.
                     */
                    if (b.getX() == x && b.getY() == y) {

                        // set flag to true.
                        hasObject = true;

                        // draw animal's symbol.
                        System.out.print(b.getSymbol());

                        // break out of checking animals loop.
                        break;
                    }
                }

                // if animal is not in this position.
                if (!hasObject) {

                    // loop through all geographicalFeatures to check if position matches.
                    for (GeographicalFeature p : geographicalFeatures) {

                        /* check if animal is in this position. at most one animal will be as we are
                         preventing multiple objects from occupying the same position.
                         */
                        if (p.getX() == x && p.getY() == y) {

                            // set flag to true.
                            hasObject = true;

                            // draw geographicalFeature's symbol.
                            System.out.print(p.getSymbol());

                            // break out of checking geographical features loop.
                            break;
                        }
                    }
                }

                // if no animal or geographical feature was in this position, print an empty space.

                if (!hasObject) {
                    System.out.print(" ");
                }

            }

            // draw right border and move onto the next line.
            System.out.printf("|%n");
        }

        // draw bottom border.
        System.out.print('|');
        for (int i = 0; i < ((Island)this).width; i++) {
            System.out.print('-');
        }
        System.out.println('|');

    }

    default void animateIsland(int numUpdates) {
        for (int i = 0; i < numUpdates; i++) {
            ((LifeEndurance)this).updateIsland();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            drawIsland();
        }
    }


}
