package com.codegym.Island;


import com.codegym.Animals.plants.Herb;

public class GenerateHerbsInIsland extends Island {


    public GenerateHerbsInIsland(int width, int height) {
        super(width, height);
    }

    void genHerb(int numHerb) {
        for (int i = 0; i < numHerb; i++) {

            int size = (int) (Math.random() * 200);
            int x = (int) (Math.random() * width);
            int y = (int) (Math.random() * height);
            int count = 0;

            while ((isOccupied(x, y)) || hasGeographicalFeature(x, y) && count < 5) {
                x = (int) (Math.random() * width);
                y = (int) (Math.random() * height);
                count++;
            }
            Herb herb = new Herb(size, x, y);
            herb.setIsland(this);
            this.geographicalFeatures.add(herb);
            this.herbList.add(herb);
        }
    }
}
