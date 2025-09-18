package september.task2;
import java.util.*;

enum MembershipType {
    REGULAR, PREMIUM
}

public class LibraryPerson {
    private String name;
    private int age;
    private MembershipType membershipType;

    public LibraryPerson(String name, int age, MembershipType membershipType) {
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }
}

class Member extends LibraryPerson {
    public Member(String name, int age, MembershipType membershipType) {
        super(name, age, membershipType);
    }
}

class Librarian extends LibraryPerson {
    public Librarian(String name, int age, MembershipType membershipType) {
        super(name, age, membershipType);
    }
}

class Library<T extends LibraryPerson> {
    private List<T> people;

    public Library(List<T> people) {
        this.people = people;
    }

    public List<T> getPeople() {
        return people;
    }

    public void setPeople(List<T> people) {
        this.people = people;
    }

    // filter by age
    public Optional<List<T>> filterByAge(int minAge) {
        List<T> filtered = new ArrayList<>();

        for(T p : people) {
            if(p.getAge() >= minAge) {
                filtered.add(p);
            }
        }

        if(filtered.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(filtered);
        }
    }

    // get by name
    public Optional<T> getByName(String name) {
        for(T p : people) {
            if(p.getName().equalsIgnoreCase(name)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}



