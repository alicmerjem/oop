package week9.tasks;
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
        return this.height - other.height;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }
}

class Main {
    public static void main(String[] args) {
        List<ClubMember> clubMembers = new ArrayList<>();

        clubMembers.add(new ClubMember("mikael", 182));
        clubMembers.add(new ClubMember("matti", 187));
        clubMembers.add(new ClubMember("joel", 184));

        Collections.sort(clubMembers);

        // search for a person with height 180
        ClubMember wanted = new ClubMember("Name", 180);
        int index = Collections.binarySearch(clubMembers, wanted);

        if (index >= 0) {
            System.out.println("A person who is 180 cm tall was found at index" + index);
            System.out.println("name: " + clubMembers.get(index).getName());
        } else {
            System.out.println("no person with heigth 180 cm was found");
        }

        // search for a person with heigth 197 cm
        wanted = new ClubMember("Name", 187);
        index = Collections.binarySearch(clubMembers, wanted);
        if (index >= 0) {
            System.out.println("A person who is 187 cm tall was found at index " + index);
            System.out.println("name: " + clubMembers.get(index).getName());
        } else {
            System.out.println("No person with height 187 cm found.");
        }

    }
}