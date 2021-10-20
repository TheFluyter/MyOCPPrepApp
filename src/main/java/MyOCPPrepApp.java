import service.CSVReader;
import service.QuestionProvider;

public class MyOCPPrepApp {
    public static void main(String[] args) {
        new CSVReader().readCSVFile();
        QuestionProvider.askQuestion();
    }
}
