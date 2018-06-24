package com.andben;

public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        Team<FootballPlayer> malmoFF = new Team<>("Malmo FF");
        malmoFF.addPlayer(joe);


        Team<FootballPlayer> aik = new Team<>("AIK");
        FootballPlayer john = new FootballPlayer("John");
        aik.addPlayer(john);

        Team<FootballPlayer> leeds = new Team<>("Leeds");
        FootballPlayer john2 = new FootballPlayer("John");
        leeds.addPlayer(john2);

        Team<FootballPlayer> barcelona = new Team<>("Barcelona");
        FootballPlayer john3 = new FootballPlayer("John");
        barcelona.addPlayer(john3);

        Team<FootballPlayer> bayer = new Team<>("Bayer");
        FootballPlayer john4 = new FootballPlayer("John");
        bayer.addPlayer(john4);

        malmoFF.matchResult(aik, 2, 5);
        bayer.matchResult(leeds, 6, 1);
        malmoFF.matchResult(aik, 6, 1);
        malmoFF.matchResult(leeds, 6, 19);
        malmoFF.matchResult(aik, 6, 1);
        bayer.matchResult(aik, 7, 7);
        malmoFF.matchResult(aik, 2, 5);
        bayer.matchResult(aik, 6, 1);
        barcelona.matchResult(aik, 6, 1);
        malmoFF.matchResult(aik, 6, 19);
        malmoFF.matchResult(aik, 6, 1);
        bayer.matchResult(barcelona, 7, 7);

        Team<BaseballPlayer> cubs = new Team<>("Cubs");
        BaseballPlayer anders = new BaseballPlayer("Anders");


        League<Team<FootballPlayer>> goldCup = new League("Gold cup");
        goldCup.addTeam(aik);
        goldCup.addTeam(malmoFF);
        goldCup.addTeam(barcelona);
        goldCup.addTeam(bayer);
        goldCup.addTeam(leeds);
//        goldCup.addTeam(cubs)

        goldCup.showTable();


    }
}
