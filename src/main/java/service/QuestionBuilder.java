package service;

import domain.Question;
import domain.Questions;

public class QuestionBuilder {
    public void makeQuestion(String question, String answer) {
        addToQuestionList(new Question(question, answer));
    }

    private void addToQuestionList(Question question) {
        Questions.addQuestion(question);
    }
}
