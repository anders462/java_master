package com.andben;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveAble {
    private String name;
    private int lifes;
    private String type;
    private int size;

    public Monster(String name, String type, int size) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.lifes = 1;
    }

    public String getName() {
        return name;
    }

    public int getLifes() {
        return lifes;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public List write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, this.type);
        values.add(2, "" + this.lifes);
        values.add(3, "" + this.size);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.type = savedValues.get(1);
            this.lifes = Integer.parseInt(savedValues.get(2));
            this.size = Integer.parseInt(savedValues.get(3));
        }

    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", lifes=" + lifes +
                ", type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}
