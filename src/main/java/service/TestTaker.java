package service;

import domain.Question;
import domain.Questions;

public class TestTaker {

    public void startTestWithProvidedQuestions(Questions questions) {
        for(Question question : questions.getQuestions()) {
            askQuestion(question);
        }
    }

    public void askQuestion(Question question) {
        System.out.println(question.getQuestion());
        CommandLineReader.readCommandLine();
        showAnswer(question);
    }

    private void showAnswer(Question question) {
        System.err.println(question.getAnswer() + "\n");
    }
}
