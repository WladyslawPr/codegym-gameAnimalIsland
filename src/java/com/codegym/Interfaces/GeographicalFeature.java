package com.codegym.Interfaces;


import com.codegym.Island.Island;

public interface GeographicalFeature {

     int getX();
     int getY();
     char getSymbol();
     Island getIsland();
     void setIsland(Island island);
     String toString();

}
