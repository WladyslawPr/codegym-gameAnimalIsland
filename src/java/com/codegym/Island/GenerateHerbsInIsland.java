package com.codegym.Island;


import com.codegym.Animals.plants.Herb;
import com.codegym.InterfacesGeographical.GeographicalFeature;
import java.util.ArrayList;
import java.util.List;
import static com.codegym.Island.Island.sumTries;


public interface GenerateHerbsInIsland  {

    List<GeographicalFeature> geographicalFeatures = new ArrayList<>();
    List<Herb> herbList = new ArrayList<>();

    default Herb hasHerb(int x, int y) {

        Herb herb = new Herb(herbList.size(), x, y);
        for (Herb herbs : herbList) {
            if(herbs.getX() == x && herbs.getY() == y) {
                herb = herbs;
                break;
            }
        }
        return herb;

    }

  default boolean hasGeographicalFeature(int x, int y) {

        boolean hasFeature = false;

        for(GeographicalFeature geographicalFeature : geographicalFeatures) {
            if (geographicalFeature.getX() == x && geographicalFeature.getY() == y) {
                hasFeature = true;
                break;
            }
        }
        return hasFeature;
    }

  default void genHerb(int numHerb) {
        for (int i = 0; i < numHerb; i++) {

            int size = (int) (Math.random() * 200);
            int x = (int) (Math.random() * ( (Island) this ).width);
            int y = (int) (Math.random() * ( (Island) this ).height);
            int count = 0;

            //(isOccupied(x, y))
            while (hasGeographicalFeature(x, y) && count < sumTries) {
                x = (int) (Math.random() * ( (Island) this ).width);
                y = (int) (Math.random() * ( (Island) this ).height);
                count++;
            }
            Herb herb = new Herb(size, x, y);
            herb.setIsland((Island) this);
            this.geographicalFeatures.add(herb);
            this.herbList.add(herb);
        }
    }


}
