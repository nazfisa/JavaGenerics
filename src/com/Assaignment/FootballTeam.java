package com.Assaignment;

public class FootballTeam extends Team {
    private String name;
    int goal;

    public FootballTeam(String name, int goal) {
        super(name, goal);
    }


    public String getName() {
        return name;
    }
}
