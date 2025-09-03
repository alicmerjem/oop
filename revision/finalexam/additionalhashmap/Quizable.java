package revision.finalexam.additionalhashmap;
import java.util.*;

interface Quizable {
    void completeQuiz(String date);
}

class Student implements Quizable {
    private HashMap<String, Integer> quizzes;

    public Student() {
        this.quizzes = new HashMap<>();
    }

    @Override
    public void completeQuiz(String date) {
        quizzes.put(date, quizzes.getOrDefault(date, 0) + 1);
    }

    public int getQuizzesCompleted(String date) {
        return quizzes.getOrDefault(date, 0);
    }
}
