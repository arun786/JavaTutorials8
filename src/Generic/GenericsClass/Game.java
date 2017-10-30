package Generic.GenericsClass;

public class Game {
    public static void main(String[] args) {
        Player cricketPlayer = new CricketPlayer("Sachin");
        Player soccerPlayer = new SoccerPlayer("Pele");
        Player hockeyPlayer = new HockeyPlayer("Dyanchand");


        Team bestOfPlayers = new Team("bestOfPlayers");
        bestOfPlayers.addPlayer(cricketPlayer);
        bestOfPlayers.addPlayer(soccerPlayer);
        bestOfPlayers.addPlayer(hockeyPlayer);

        System.out.println(bestOfPlayers.getNumberOfPlayers());
    }
}
