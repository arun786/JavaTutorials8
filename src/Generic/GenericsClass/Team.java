package Generic.GenericsClass;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private int won;
    private int lost;
    private int tied;
    private int played;

    private List<Player> lstOfPlayers = new ArrayList<>();


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player) {
        if (lstOfPlayers.contains(player)) {
            System.out.println(player.getName() + " already present in the team");
            return false;
        }

        lstOfPlayers.add(player);
        System.out.println(player.getName() + " added to team " + this.name);
        return true;
    }

    public int getNumberOfPlayers(){
        return this.lstOfPlayers.size();
    }


}
