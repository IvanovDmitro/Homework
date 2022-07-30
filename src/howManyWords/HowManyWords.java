package howManyWords;

import java.util.Scanner;

public class HowManyWords {

    String sentence;
    int count;

    void runApp() {
        doInputs();
        wordsCount();
        printInfo();
    }

    void doInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type sentence in one line used space");
        sentence = sc.nextLine();
    }

    void wordsCount() {
        count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
    }

    void printInfo() {
        System.out.println("The number of words you typed: " + count);
    }
}
