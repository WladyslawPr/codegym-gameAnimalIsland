package com.codegym.Island;

import com.codegym.Animals.carnivore.*;
import com.codegym.Animals.herbivore.*;
import com.codegym.Animals.Abstract.*;
import java.util.ArrayList;
import java.util.List;
import static com.codegym.Island.Island.sumTries;


public interface GenerateAnimalsInIsland {

    List<Animal> animals = new ArrayList<>();

    default boolean isOccupied(int x, int y) {

        boolean isOccupied = false;

        for (Animal animal : animals) {
            if (animal.getX() == x && animal.getY() == y) {
                isOccupied = true;
                break;
            }
        }
        return isOccupied;
    }

  // im sorry, this method wishes to be better.
    default void genAnimals(int numAnimals) {
        for (int i = 0; i < numAnimals; i++) {

            int x = (int) ( Math.random() * ( (Island) this ).width );
            int y = (int) ( Math.random() * ( (Island) this ).height );

            int count = 0;
            while (isOccupied(x, y) && count < sumTries) {
                x = (int) ( Math.random() * ( (Island) this ).width );
                y = (int) ( Math.random() * ( (Island) this ).height );
                count++;
            }

            int energy = (int) ( Math.random() * 100 );
            double randomAnimal = Math.random();

           Animal animal = null;
            if (randomAnimal < 0.5) {
                animal = new Bear(x, y, energy);
            } else if (randomAnimal < 1) {
                    animal = new Boa(x, y, energy);
                } else if (randomAnimal < 1.5) {
                    animal = new Eagle(x, y, energy);
                } else if (randomAnimal < 2) {
                    animal = new Fox(x, y, energy);
                } else if (randomAnimal < 2.5) {
                    animal = new Wolf(x, y, energy);
                } else if (randomAnimal < 3) {
                    animal = new Boar(x, y, energy);
                } else if (randomAnimal < 3.5) {
                    animal = new Buffalo(x, y, energy);
                } else if (randomAnimal < 4) {
                    animal = new Caterpillar(x, y, energy);
                } else if (randomAnimal < 4.5) {
                    animal = new Deer(x, y, energy);
                } else if (randomAnimal < 5) {
                    animal = new Duck(x, y, energy);
                } else if (randomAnimal < 5.5) {
                    animal = new Goat(x, y, energy);
                } else if (randomAnimal < 6) {
                    animal = new Horse(x, y, energy);
                } else if (randomAnimal < 6.5) {
                    animal = new Mouse(x, y, energy);
                } else if (randomAnimal < 7) {
                    animal = new Rabbit(x, y, energy);
                } else if (randomAnimal < 7.5) {
                    animal = new Sheep(x, y, energy);
                }

                animals.add(animal);
                assert animal != null;
                animal.setIsland((Island) this);

        }
    }
}
