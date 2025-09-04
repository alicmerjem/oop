package revision.tasks.encapsulation;
import java.util.*;

public class Team {
    private ArrayList<Person> players;

    public Team() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Person player) {
        players.add(player);
    }

    public void listPlayers() {
        if(players.isEmpty()) {
            System.out.println("nothing to be found");
        } else {
            for(Person p : players) {
                System.out.println(p);
            } 
        }
    }

    public void removePlayerByAge(int age) {
        boolean removed = false;

        for(int i = 0; i < players.size(); i++) {
            if(players.get(i).getAge() == age) {
                System.out.println(players.get(i).getName() + " (age " + age + ") has been removed from the team");
                players.remove(i);
                removed = true;
                break;
            }
        }

        if(!removed) {
            System.out.println("nothing found");
        }
    }
}
