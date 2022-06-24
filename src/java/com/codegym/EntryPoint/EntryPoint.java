package com.codegym.EntryPoint;

import com.codegym.Island.Island;


public class EntryPoint  {

    public EntryPoint() {

        // create islands
        Island island = new Island(100, 20);

        island.genAnimals(200);
        island.genHerb(200);
        island.animateIsland(3);
        island.reportNumAnimals();
        island.printAnimalInfo();
        island.printGeographicalFeatureInfo();

    }

    public static void main(String[] args) {
        new EntryPoint();

    }

}
