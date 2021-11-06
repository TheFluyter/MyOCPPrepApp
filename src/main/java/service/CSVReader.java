package service;

import com.opencsv.bean.CsvToBeanBuilder;
import domain.Question;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public List<Question> readQuestionsFromCSV(String pathName) {
        List<Question> questions = new ArrayList<>();

        try {
            questions = new CsvToBeanBuilder<Question>(new FileReader(pathName))
                    .withType(Question.class)
                    .build()
                    .parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("No such file found: " + pathName);
        }
        return questions;
    }
}
