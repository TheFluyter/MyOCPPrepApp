package domain;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    private static int numberOfQuestions = 0;
    private final static List<Question> questions = new ArrayList<>();

    public static void addQuestion(Question question) {
        questions.add(question);
        numberOfQuestions++;
    }

    public static void addQuestionList(List<Question> newQuestions) {
        questions.addAll(newQuestions);
        numberOfQuestions += newQuestions.size();
    }

    public static Question getQuestion() {
        return questions.get(randomQuestionNumber());
    }

    public static int randomQuestionNumber() {
        return (int) (Math.random() * (numberOfQuestions));
    }
}
