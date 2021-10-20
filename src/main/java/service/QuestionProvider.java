package service;

import domain.Question;
import domain.Questions;

public class QuestionProvider {
    public static void askQuestion() {
        Question question = Questions.getQuestion();
        System.out.println(question.getQuestion());
        showAnswer(question);
    }

    private static void showAnswer(Question question) {
        CommandLineReader.readCommandLine();
        System.out.println(question.getAnswer() + "\n");
        askQuestion();
    }
}
