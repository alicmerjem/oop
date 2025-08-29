package week9.labs;
import java.util.*;

public class ClubMember implements Comparable<ClubMember>{
    private String name;
    private int height;

    public ClubMember(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(ClubMember other) {
        return Integer.compare(this.height, other.height);
    }

    @Override
    public String toString() {
        return name + " " + height;
    }
}

class Main {
    public static void main(String[] args) {
        List<ClubMember> members = new ArrayList<>();
        members.add(new ClubMember("Alice", 165));
        members.add(new ClubMember("Bob", 180));
        members.add(new ClubMember("Charlie", 175));
        members.add(new ClubMember("Diana", 160));
        
        Collections.sort(members);
        for(ClubMember m : members) {
            System.out.println(m);
        }

        ClubMember searchKey = new ClubMember("dummy", 175);
        int index = Collections.binarySearch(members, searchKey);

        if(index >= 0) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
