package com.codegym.InterfacesGeographical;


import com.codegym.Island.Island;

public interface GeographicalFeature {

     int getX();
     int getY();
     char getSymbol();
     Island getIsland();
     void setIsland(Island island);
     String toString();

}
