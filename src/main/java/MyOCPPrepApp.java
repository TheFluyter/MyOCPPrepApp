import service.CSVReader;
import service.QuestionProvider;

import java.util.Comparator;

public class MyOCPPrepApp {
    public static void main(String[] args) {
        String path = "/Users/sparerotterdam/Development/projects/testground/MyOCPPrepApp/src/main/resources/ExamQuestions.csv";
        new CSVReader().readCSVFile(path);
        QuestionProvider.askQuestion();
    }
}
