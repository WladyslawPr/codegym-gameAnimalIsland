package com.codegym.Island;

import com.codegym.Animals.plants.Herb;
import com.codegym.Interfaces.Animal;
import com.codegym.Interfaces.GeographicalFeature;

import java.util.ArrayList;
import java.util.List;

public class Island {

    protected int width;
    protected int height;


    List<Animal> animals = new ArrayList<>();
    List<GeographicalFeature> geographicalFeatures = new ArrayList<>();
    List<Herb> herbList = new ArrayList<>();


   public Island(int width, int height) {
        this.width = width;
        this.height = height;
    }


     Herb hasHerb(int x, int y) {

       Herb herb = null;
       for (Herb herbs : herbList) {
           if(herbs.getX() == x && herbs.getY() == y) {
               herb = herbs;
               break;
           }
       }
       return herb;

    }

    // Test
    boolean isOccupied(int x, int y) {

       boolean isOccupied = false;

        for (Animal animal : animals) {
            if (animal.getX() == x && animal.getY() == y) {
                isOccupied = true;
                break;
            }
        }
        return isOccupied;
    }

    boolean hasGeographicalFeature(int x, int y) {

       boolean hasFeature = false;

       for(GeographicalFeature geographicalFeature : geographicalFeatures) {
           if (geographicalFeature.getX() == x && geographicalFeature.getY() == y) {
               hasFeature = true;
               break;
           }
       }
       return hasFeature;
    }

    void printAnimalInfo() {
       for(Animal beast : this.animals) {
           System.out.println(beast.toString());
       }
    }

    void printGeographicalFeatureInfo() {

       for(GeographicalFeature feature : this.geographicalFeatures) {
           System.out.println(feature.toString());
       }
    }




}
