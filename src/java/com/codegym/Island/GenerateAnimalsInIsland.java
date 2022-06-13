package com.codegym.Island;


import com.codegym.Interfaces.Animal;

public class GenerateAnimalsInIsland extends Island {

    public GenerateAnimalsInIsland(int width, int height) {
        super(width, height);
    }

    void genAnimals(int numAnimals) {
        for (int i = 0; i < numAnimals; i++) {

            int x = (int) (Math.random() * width);
            int y = (int) (Math.random() * height);

            int count = 0;
            while(isOccupied(x, y) && count < 5) {
                x = (int) (Math.random() * width);
                y = (int) (Math.random() * height);
                count++;
            }

            int energy = (int) (Math.random() * 10);
            double randomAnimal = Math.random();

            Animal animal = null;
            if (randomAnimal < 0.5) {
                //  animal = new Bear(x, y, energy);
            } else if (randomAnimal < 1) {
                //   animal = new Boa(x, y, energy);
            } else if (randomAnimal < 1.5) {
                //  animal = new Eagle(x, y, energy);
            } else if (randomAnimal < 2) {
                //  animal = new Fox(x, y, energy);
            } else if (randomAnimal < 2.5) {
                //  animal = new Wolf(x, y, energy);
            } else if (randomAnimal < 3) {
                //  animal = new Boar(x, y, energy);
            } else if (randomAnimal < 3.5) {
                //  animal = new Buffalo(x, y, energy);
            } else if (randomAnimal < 4) {
                //  animal = new Caterpillar(x, y, energy);
            } else if (randomAnimal < 4.5) {
                //  animal = Deer(x, y, energy);
            } else if (randomAnimal < 5) {
                //  animal = new Duck(x, y, energy);
            } else if (randomAnimal < 5.5) {
                //  animal = new Goat(x, y, energy);
            } else if (randomAnimal < 6) {
                //  animal = new Horse(x, y, energy);
            } else if (randomAnimal < 6.5) {
                //  animal = new Mouse(x, y, energy);
            } else if (randomAnimal < 7) {
                //  animal = Rabbit(x, y, energy);
            } else if (randomAnimal < 7.5) {
                //  animal = new Sheep(x, y, energy);
            }
            this.animals.add(animal);
            animal.setIsland(this);
        }
    }
}
