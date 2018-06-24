package com.andben;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveAble {
    private String name;
    private int lifes;
    private int score;
    private String weapon;

    public Player(String name, int lifes, int score) {
        this.name = name;
        this.lifes = lifes;
        this.score = score;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifes() {
        return lifes;
    }

    public void setLifes(int lifes) {
        this.lifes = lifes;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", lifes=" + lifes +
                ", score=" + score +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.lifes); // cast to string
        values.add(2, "" + this.score);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.lifes = Integer.parseInt(savedValues.get(1));
            this.score = Integer.parseInt((savedValues.get(2)));
            this.weapon = savedValues.get(3);
            System.out.println("Loaded " + this.name);
        }

    }
}
