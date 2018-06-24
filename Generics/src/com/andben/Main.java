package com.andben;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> malmoFF = new Team<>("Malmo FF");
        malmoFF.addPlayer(joe);
//        malmoFF.addPlayer(pat);
//        malmoFF.addPlayer(beckham);

        Team<BaseballPlayer> cubs = new Team<>("Chicago Cubs");
        cubs.addPlayer(pat);

        System.out.println(malmoFF.numPlayers());

        Team<FootballPlayer> aik = new Team<>("AIK");
        FootballPlayer john = new FootballPlayer("John");

        aik.addPlayer(john);

        malmoFF.matchResult(aik, 2, 5);
        malmoFF.matchResult(aik, 6, 1);
        malmoFF.matchResult(aik, 6, 1);
        malmoFF.matchResult(aik, 6, 19);
        malmoFF.matchResult(aik, 6, 1);
        malmoFF.matchResult(aik, 7, 7);

        System.out.println(malmoFF.getName() + " ranking " + malmoFF.ranking());
        System.out.println(aik.getName() + "ranking " + aik.ranking());
        System.out.println("winner " + aik.compareTo(malmoFF));


    }

}
