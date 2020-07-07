package com.Assaignment;

public  class Team<T> implements Comparable<Team<T>>{
    private String name;
    private int goal;

    public Team(String name, int goal){
        this.name = name;
        this.goal = goal;
    }

    public String getName() {
        return name;
    }

    public int getGoal() {
        return this.goal;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.goal > team.goal)
            return -1;
        else if(this.goal < team.goal)
            return 1;
        else
            return 0;
    }


}
