package service;

import com.opencsv.bean.CsvToBeanBuilder;
import domain.Question;
import domain.Questions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    QuestionBuilder questionBuilder = new QuestionBuilder();
    private final String pathName = "/Users/sparerotterdam/Development/projects/testground/MyOCPPrepApp/src/main/resources/OCPQuestions.csv";

    public void readCSVFile() {
        List<Question> questions = new ArrayList<>();

        try {
            questions = new CsvToBeanBuilder<Question>(new FileReader(pathName))
                    .withType(Question.class)
                    .build()
                    .parse();
        } catch (FileNotFoundException e) {
            // TODO
        }

        Questions.addQuestionList(questions);
    }

    private void provideQuestionAndAnswer(String question, String answer) {
        questionBuilder.makeQuestion(question, answer);
    }
}
