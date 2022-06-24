package com.codegym.Animals.carnivore;

import com.codegym.Animals.Abstract.Animal;
import com.codegym.Animals.plants.Herb;
import com.codegym.Annotantions.ParametersWithCarnivore;
import com.codegym.Island.Island;


//@Emoji
//@Data
@ParametersWithCarnivore(maxCountPerCell = 20, speedCellsPerTurn = 3)
public class Eagle extends Animal {

    private char symbol = 'E';

    public Eagle() {
        this.x = 0;
        this.y = 0;
        this.energy = 1;
        this.island = null;
        this.id = idList.size() + 1;
        idList.add(id);
    }

    public Eagle(int x, int y, int energy) {
        this.x = x;
        this.y = y;
        this.energy = energy;
        this.island = null;
        this.id = idList.size() + 1;
        idList.add(id);
    }

    @Override
    public void move(double direction) {
        int distance = (int) (Math.random() * 3);
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
            move(Math.random(), 3);
        }
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "symbol=" + symbol +
                ", x=" + x +
                ", y=" + y +
                ", energy=" + energy +
                ", id=" + id +
                ", island=" + island +
                '}';
    }
}
