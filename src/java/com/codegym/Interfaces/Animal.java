package com.codegym.Interfaces;


import com.codegym.Island.Island;

public interface Animal {  // abstract class ?


    int getX(); //  [][] ?
    int getY();

    void move(double direction);    // from 1 to 4;


    char getSymbol();
    int getEnergy();  // min, max saturation ?


    void increaseEnergy();
    void decreaseEnergy();
    void increaseEnergy(int energy);
    void decreaseEnergy(int energy);


    String toString();
    void setIsland(Island island);

    //boolean isKill();  ?
    boolean isHungry();
    boolean isThirsty();
    boolean feedSelf();
    void seekFood();
}
