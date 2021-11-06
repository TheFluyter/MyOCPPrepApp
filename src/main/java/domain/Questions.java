package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Questions {

    private final List<Question> questions = new ArrayList<>();
    public int numberOfQuestions;

    public Questions(List<Question> questions) {
        this.questions.addAll(questions);
        shuffleQuestions();
        numberOfQuestions += questions.size();
    }

    public void shuffleQuestions() {
        Collections.shuffle(questions);
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
