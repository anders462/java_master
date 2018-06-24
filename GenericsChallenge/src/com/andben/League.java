package com.andben;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
    }

    public void showTable() {
        Collections.sort(league);
        System.out.println("------- " + this.name + " -------");
        for (T team : league) {
            System.out.println("name: " + team.getName() + " ranking: " + team.ranking());
        }
    }
}
