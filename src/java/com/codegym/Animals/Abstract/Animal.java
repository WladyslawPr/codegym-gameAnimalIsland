package com.codegym.Animals.Abstract;

import com.codegym.Island.Island;
import java.util.ArrayList;
import java.util.List;


public abstract class Animal implements Move, SeekFood {

    protected static final double MOVE_NORTH = 0.25;
    protected static final double MOVE_EAST = 0.5;
    protected static final double MOVE_SOUTH = 0.75;
    protected static final double MOVE_WEST = 1;

    protected int x;
    protected int y;
    protected char symbol;
    protected int energy;
    protected int id;
    protected Island island;
    protected static List<Integer> idList = new ArrayList<>();

    public int getX() {
        return x;
    }

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

    public char getSymbol() {    // @Emoji ?
        return symbol;
    }

    public int getEnergy() {
        return energy;
    }

    public void increaseEnergy() {
        this.energy++;

    }

    public void decreaseEnergy() {
        this.energy--;

    }

    protected void increaseEnergy(int energy) {
        this.energy = this.energy + energy;

    }

    public void decreaseEnergy(int energy) {
        this.energy = this.energy - energy;

    }

    public Island getIsland() {
        return island;
    }

    public void setIsland(Island island) {
        this.island = island;

    }

    public boolean isHungry() {
        return (energy < this.energy);
    }

}




