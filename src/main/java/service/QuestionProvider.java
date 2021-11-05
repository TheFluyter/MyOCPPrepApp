package service;

import domain.Question;
import domain.Questions;

public class QuestionProvider {
    public static void askQuestion() {
        Question question = Questions.getRandomQuestion();
        System.out.println(question.getQuestion());
        showAnswer(question);
    }

    private static void showAnswer(Question question) {
        CommandLineReader.readCommandLine();
        System.err.println(question.getAnswer() + "\n");
        askQuestion();
    }
}
