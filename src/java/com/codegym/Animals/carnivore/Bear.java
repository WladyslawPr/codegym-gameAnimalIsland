package com.codegym.Animals.carnivore;

import com.codegym.Annotantions.ParametersWithCarnivore;
import com.codegym.Interfaces.Animal;
import com.codegym.Island.Island;
// import lombok.*;


//@Emoji
//@Data
@ParametersWithCarnivore(weight = 500, maxCountPerCell = 5, maxSaturation = 80)
public class Bear implements Animal {


   @Override
   public int getX() {
      return 0;
   }

   @Override
   public int getY() {
      return 0;
   }

   @Override
   public void move(double direction) {

   }

   @Override
   public char getSymbol() {    // @Emoji ?
      return 0;
   }

   @Override
   public int getEnergy() {
      return 0;
   }

   @Override
   public void increaseEnergy() {

   }

   @Override
   public void decreaseEnergy() {

   }

   @Override
   public void increaseEnergy(int energy) {

   }

   @Override
   public void decreaseEnergy(int energy) {

   }

   @Override
   public void setIsland(Island island) {

   }

   @Override
   public boolean isHungry() {
      return false;
   }

   @Override
   public boolean isThirsty() {
      return false;
   }

   @Override
   public boolean feedSelf() {
      return false;
   }

   @Override
   public void seekFood() {

   }
}
