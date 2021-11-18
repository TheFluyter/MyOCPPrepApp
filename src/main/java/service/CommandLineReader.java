package service;

import java.util.Scanner;

public class CommandLineReader {
    public static String readCommandLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
