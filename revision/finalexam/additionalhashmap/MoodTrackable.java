package revision.finalexam.additionalhashmap;
import java.util.*;

interface MoodTrackable {
    void addMood(String date, String mood);
}

class Student implements MoodTrackable {
    private HashMap<String, String> moodsBydate;

    public Student() {
        this.moodsBydate = new HashMap<>();
    }

    @Override
    public void addMood(String date, String mood) {
        String existingMoods = moodsBydate.getOrDefault(date, "");
        
        if(existingMoods.isEmpty()) {
            moodsBydate.put(date, mood);
        } else {
            moodsBydate.put(date, existingMoods + ", " + mood);
        }
    } 

    public String getMoods(String date) {
        return moodsBydate.getOrDefault(date, "no moods recorded");
    }
}
