package Miscelanous;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("AdelaideCrows");
        adelaideCrows.addPlayer(joe);

        Team<FootballPlayer> melbourne = new Team<>("melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("Manchester United");
        soccerTeam.addPlayer(beckham);

//        System.out.println(adelaideCrows.numPlayers());
//        System.out.println(baseballTeam.numPlayers());
//        System.out.println(soccerTeam.numPlayers());



//        hawthorn.matchResult(fremantle, 1, 0);
//        hawthorn.matchResult(adelaideCrows, 3, 8);

//        adelaideCrows.matchResult(fremantle, 2, 1);
        // adelaideCrows.matchResult(baseballTeam,1,1);
//        System.out.println("Rankings");
//        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
//        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
//        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
//        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
//        System.out.println(adelaideCrows.compareTo(melbourne));
//        System.out.println(hawthorn.compareTo(adelaideCrows));
//        System.out.println(hawthorn.compareTo(adelaideCrows));

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

     //   footballLeague.showLeagueTable();

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);



//       footballLeague.add(baseballTeam);


        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(beckham); // unchecked warning
        rawTeam.addPlayer(pat);     // unchecked warning

        footballLeague.add(rawTeam);     // unchecked warning

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.add(adelaideCrows);     // no warning
        rawLeague.add(baseballTeam);    // no warning
        rawLeague.add(rawTeam);         // no warning

        League reallyRaw = new League("Really raw");
        reallyRaw.add(adelaideCrows);     // unchecked warning
        reallyRaw.add(baseballTeam);    // unchecked warning
        reallyRaw.add(rawTeam);         // unchecked warning
        System.out.println("--------------------------------- ");
        reallyRaw.showLeagueTable();
    }
}
   