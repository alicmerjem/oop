package revision.tasks.collectionslambdas;

import java.util.*;

public class ClubMember implements Comparable<ClubMember>{
    private String name;
    private int height;

    public ClubMember(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() { return name; }
    public int getHeight() { return height; }

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


        members.add(new ClubMember("Mikael", 182));
        members.add(new ClubMember("Matti", 187));
        members.add(new ClubMember("Joel", 184));

        Collections.sort(members);

        for(ClubMember m : members) {
            System.out.println(m);
        }

        ClubMember search = new ClubMember("any", 187);
        int idx = Collections.binarySearch(members, search);
        System.out.println("found at index " + idx);
    }
}
