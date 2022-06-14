package com.codegym.Animals.carnivore;

import com.codegym.Animals.plants.Herb;
import com.codegym.Annotantions.ParametersWithCarnivore;
import com.codegym.Interfaces.Animal;

import com.codegym.Island.Island;

import java.util.ArrayList;
import java.util.List;
// import lombok.*;


//@Emoji
//@Data
@ParametersWithCarnivore(weight = 500, maxCountPerCell = 5, maxSaturation = 80)
public class Bear implements Animal {

   private char symbol = 'B'; // later emoji;
   private int x;
   private int y;
   private int energy; // max 80 - "8";
   private int id;
   private Island island;

   private static List<Integer> idList = new ArrayList<>();

   public Bear() {
      this.x = 0;
      this.y = 0;
      this.energy = 80;
      this.island = null;
      this.id = idList.size() + 1;
      idList.add(id);
   }

   public Bear(int x, int y, int energy) {
      this.x = x;
      this.y = y;
      this.energy = energy;
      this.island = null;
      this.id = idList.size() + 1;
      idList.add(id);
   }

   void move(double direction, int distance) {

      int initX = this.x;
      int initY = this.y;

      int newX = initX;
      int newY = initY;

      if (direction < 0.25) {
         // north.
         newY = initY - distance;
      } else if (direction < 0.5) {
         // east.
         newX = initX + distance;
      } else if (direction < 0.75) {
         // south.
         newY = initY + distance;
      } else if (direction < 1) {
         // west.
         newX = initX - distance;
      }

      if (this.island != null) {
         int width = this.island.getWidth();
         int height = this.island.getHeight();

         if (newX < 0) {
            newX = width - 1;
         } else if (newX > width - 1) {
            newX = 0;
         }

         if (newY < 0) {
            newY = height - 1;
         } else if (newY > height - 1) {
            newY = 0;
         }
         if (island.isOccupied(newX, newY)) {
            newX = initX;
            newY = initY;
         }
      }
      this.x = newX;
      this.y = newY;

   }




   @Override
   public void move(double direction) {
      int distance = (int) (Math.random() * 2);
      move(direction, distance);

   }

   @Override
   public int getX() {
      return x;
   }

   @Override
   public int getY() {
      return y;
   }

   public void setX(int x) {
      this.x = x;
   }

   public void setY(int y) {
      this.y = y;
   }

   public int getId() {
      return id;
   }

   @Override
   public char getSymbol() {    // @Emoji ?
      return symbol;
   }

   @Override
   public int getEnergy() {
      return energy;
   }

   @Override
   public void increaseEnergy() {
      this.energy++;

   }

   @Override
   public void decreaseEnergy() {
      this.energy--;

   }

   @Override
   public void increaseEnergy(int energy) {
      this.energy = this.energy + energy;

   }

   @Override
   public void decreaseEnergy(int energy) {
      this.energy = this.energy - energy;

   }

   public Island getIsland() {
      return island;
   }

   @Override
   public void setIsland(Island island) {
      this.island = island;

   }

   @Override
   public boolean isHungry() {
      return (energy < 80);
   }

 /*  @Override
   public boolean isThirsty() {
      return false;
   }

  */

   @Override
   public boolean feedSelf() {
      Herb herb = island.hasHerb(x, y);
      if (herb != null) {
         herb.decreaseSize(4);
         increaseEnergy(10);
         return true;
      } else {
         return false;
      }

   }

     @Override
   public void seekFood() {

      if (island.hasHerb(x, y) != null) {
         feedSelf();


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

   @Override
   public String toString() {
      return "Bear{" +
              "symbol=" + symbol +
              ", x=" + x +
              ", y=" + y +
              ", energy=" + energy +
              ", id=" + id +
              ", island=" + island +
              '}';
   }
}
