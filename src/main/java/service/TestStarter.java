package service;

import domain.Questions;

public class TestStarter {

    public void buildTest() {
        String path = "/Users/sparerotterdam/Development/projects/testground/MyOCPPrepApp/src/main/resources/ExamQuestions.csv";
        startTest(getQuestionFromCSVFile(path));
    }

    private void startTest(Questions questions) {
        TestTaker testTaker = new TestTaker();
        testTaker.startTestWithProvidedQuestions(questions);
    }

    private Questions getQuestionFromCSVFile(String path) {
        return new Questions(new CSVReader().readQuestionsFromCSV(path));
    }
}
