package com.Assaignment;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>  {
    ArrayList<T> league = new ArrayList<>();
    private String name;

    private int goal;

    public void addTeam(T team){
        if (league.contains(team)) {
            System.out.println(team.getName()+ " Already exists.");
        }
        else {
            league.add(team);

        }
    }
    public void showLeagueTable(){
        Collections.sort(league);
        for (T item: league) {
            System.out.println(item.getName()+" "+item.getGoal());
        }

    }


}
