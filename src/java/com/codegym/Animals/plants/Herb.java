package com.codegym.Animals.plants;


import com.codegym.Interfaces.GeographicalFeature;
import com.codegym.Island.Island;

import java.util.ArrayList;
import java.util.List;

//@Emoji
//@Data
public class Herb implements GeographicalFeature {


    private int size; // max size 200 !?
    private char symbol = '#';  // later -> Emoji ?
    private int x;
    private int y;
    private Island island;
    private int id;


    private static List<Integer> listId = new ArrayList<>();

    Herb(int size, int x, int y) {

        this.size = size;
        this.x = x;
        this.y = y;
        this.island = null;
        this.id = listId.size() + 1;

        listId.add(id);
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size++;
    }

    void increaseSize() {
        this.size++;
    }

    void decreaseSize() {
        this.size--;
    }

    void increaseSize(int increment) {
        this.size = this.size + increment;
    }

    void decreaseSize(int increment) {
        this.size = this.size - increment;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    public char setSymbol(char symbol) {    // ?
        return symbol;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public Island getIsland() {
        return island;
    }

    public void setIsland(Island island) {
        this.island = island;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Herb{" +
                "size=" + size +
                ", symbol=" + symbol +
                ", x=" + x +
                ", y=" + y +
                ", island=" + island +
                ", id=" + id +
                '}';
    }
}
