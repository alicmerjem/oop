package revision.tasks.encapsulation;
import java.util.*;

public class Group {
    private ArrayList<Person> members;

    public Group() {
        this.members = new ArrayList<>();
    }

    public void addPerson(Person person) {
        members.add(person);
    }

    public void listPeople() {
        if(members.isEmpty()) {
            System.out.println("the group has no members");
        } else {
            for(Person p : members) {
                System.out.println(p);
            }
        }
    }

    public void removePerson(String name) {
        boolean removed = false;

        for(int i = 0; i < members.size(); i++) {
            if(members.get(i).getName().equals(name)) {
                members.remove(i);
                removed = true;
                break;
            }
        }

        if(removed) {
            System.out.println(name + " has been removed from the list");
        } else {
            System.out.println(name + " was never in the list");
        }
    }
}
