package com.Assaignment;

import com.Assaignment.FootballTeam;

public class Main {
    public static void main(String[] args) {
        Team<FootballTeam> hawthorn= new Team<>("hawthron",10);
        Team<FootballTeam> fremantle= new Team<>("Fremantle",11);
        Team<FootballTeam> fremantle1= new Team<>("Fremantle1",9);
        Team<FootballTeam> fremantle2= new Team<>("Fremantle2",12);

        League<Team<FootballTeam>> league= new League<>();
        league.addTeam(hawthorn);
        league.addTeam(fremantle);
        league.addTeam(fremantle1);
        league.addTeam(fremantle2);
        league.showLeagueTable();

    }
}
