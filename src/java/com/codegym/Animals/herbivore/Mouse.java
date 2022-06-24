package com.codegym.Animals.herbivore;

import com.codegym.Animals.Abstract.Animal;
import com.codegym.Animals.plants.Herb;
import com.codegym.Annotantions.ParametersWithHerbivore;
import com.codegym.Island.Island;


//@Emoji
//@Data
@ParametersWithHerbivore(weight = 0.05, maxCountPerCell = 500, speedCellsPerTurn = 1, maxSaturation = 0.1)
public class Mouse extends Animal {

    private char symbol = '8';

    public Mouse() {
        this.x = 0;
        this.y = 0;
        this.energy = 1;
        this.island = null;
        this.id = idList.size() + 1;
        idList.add(id);
    }

    public Mouse(int x, int y, int energy) {
        this.x = x;
        this.y = y;
        this.energy = energy;
        this.island = null;
        this.id = idList.size() + 1;
        idList.add(id);
    }

    @Override
    public void move(double direction) {
        int distance = (int) (Math.random() * 1);
        move(direction, distance);

    }

    @Override
    public void move(double direction, int distance) {
        super.move(direction, distance);
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
        return (energy < 1);
    }

    @Override
    public boolean feedSelf() {
        Herb herb = island.hasHerb(x, y);
        if (herb != null) {
            herb.decreaseSize(4);
            increaseEnergy(1);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void seekFood() {

        if (island.hasHerb(x, y) != null) {
            feedSelf();
        } else {
            move(Math.random(), 1);
        }
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "symbol=" + symbol +
                ", x=" + x +
                ", y=" + y +
                ", energy=" + energy +
                ", id=" + id +
                ", island=" + island +
                '}';
    }
}
