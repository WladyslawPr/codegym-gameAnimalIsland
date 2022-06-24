package com.codegym.Island;

import com.codegym.Animals.Abstract.*;
import com.codegym.InterfacesGeographical.GeographicalFeature;
import java.util.List;



public class Island implements GenerateAnimalsInIsland, GenerateHerbsInIsland, AnimalCounting, LifeEndurance, DrawIsland {

    protected static final int sumTries = 5;

    protected int width;
    protected int height;

   public Island(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        // check incoming animal's position is not already occupied before adding to island
        if (!isOccupied(animal.getX(), animal.getY())) {
            this.animals.add(animal);

        }
    }

    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }

    public void printAnimalInfo() {
       for(Animal beast : this.animals) {
           System.out.println(beast.toString());
       }
    }

    public void printGeographicalFeatureInfo() {

       for(GeographicalFeature feature : this.geographicalFeatures) {
           System.out.println(feature.toString());
       }

    }

}
