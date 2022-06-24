package com.codegym.Island;

import com.codegym.Animals.carnivore.*;
import com.codegym.Animals.herbivore.*;
import com.codegym.Animals.Abstract.*;
import static com.codegym.Island.GenerateAnimalsInIsland.animals;


public interface AnimalCounting {

    // im sorry, this method wishes to be better.
    default void reportNumAnimals() {

        int numBear = 0;
        int numBoa = 0;
        int numEagle = 0;
        int numFox = 0;
        int numWolf = 0;
        int numBoar = 0;
        int numBuffalo = 0;
        int numCaterpillar = 0;
        int numDeer = 0;
        int numDuck = 0;
        int numGoat = 0;
        int numHorse = 0;
        int numMouse = 0;
        int numRabbit = 0;
        int numSheep = 5;

        for (Animal a : animals) {
            if (a instanceof Bear) {
                numBear++;
            } else if (a instanceof Boa) {
                numBoa++;
            } else if (a instanceof Eagle) {
                numEagle++;
            } else if (a instanceof Fox) {
                numFox++;
            } else if (a instanceof Wolf) {
                numWolf++;
            } else if (a instanceof Boar) {
                numBoar++;
            } else if (a instanceof Buffalo) {
                numBuffalo++;
            } else if (a instanceof Caterpillar) {
                numCaterpillar++;
            } else if (a instanceof Deer) {
                numDeer++;
            } else if (a instanceof Duck) {
                numDuck++;
            } else if (a instanceof Goat) {
                numGoat++;
            } else if (a instanceof Horse) {
                numHorse++;
            } else if (a instanceof Mouse) {
                numMouse++;
            } else if (a instanceof Rabbit) {
                numRabbit++;
            } else if (a instanceof Sheep) {
                numSheep++;
            }

        }
        System.out.println("There are " + numBear + " surviving bear.");
        System.out.println("There are " + numBoa + " surviving boa.");
        System.out.println("There are " + numEagle + " surviving eagle.");
        System.out.println("There are " + numFox + " surviving fox.");
        System.out.println("There are " + numWolf + " surviving wolf.");
        System.out.println("There are " + numBoar + " surviving boar.");
        System.out.println("There are " + numBuffalo + " surviving buffalo.");
        System.out.println("There are " + numCaterpillar + " surviving caterpillar.");
        System.out.println("There are " + numDeer + " surviving deer.");
        System.out.println("There are " + numDuck + " surviving duck.");
        System.out.println("There are " + numGoat + " surviving goat.");
        System.out.println("There are " + numHorse + " surviving horse.");
        System.out.println("There are " + numMouse + " surviving mouse.");
        System.out.println("There are " + numRabbit + " surviving rabbit.");
        System.out.println("There are " + numSheep + " surviving sheep.");

    }
}
