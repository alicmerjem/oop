package revision.finalexam.additionalhashmap;
import java.util.*;

interface Checkable {
    void checkIn(String date);
}

class Member implements Checkable {
    private HashMap<String, Integer> checkIns;

    public Member() {
        this.checkIns = new HashMap<>();
    }

    @Override
    public void checkIn(String date) {
        checkIns.put(date, checkIns.getOrDefault(date, 0) + 1);
    }

    public int getCheckIns(String date) {
        return checkIns.getOrDefault(date, 0);
    }
}
