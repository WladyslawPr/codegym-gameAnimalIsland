package com.codegym.Animals.carnivore;

import com.codegym.Animals.Abstract.Animal;
import com.codegym.Annotantions.ParametersWithCarnivore;
import com.codegym.Island.Island;


//@Emoji
//@Data
@ParametersWithCarnivore(weight = 500, maxCountPerCell = 5, maxSaturation = 80)
public class Bear extends Animal {

   private char symbol = 'B';

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

   @Override
   public boolean feedSelf() {
      return super.feedSelf();
   }

   @Override
   public void seekFood() {
      super.seekFood();
   }

   @Override
   public void move(double direction) {
      super.move(direction);
   }

   @Override
   public void move(double direction, int distance) {
      super.move(direction, distance);
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
