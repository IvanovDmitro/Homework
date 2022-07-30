package howManyWords;

import java.util.Scanner;

public class HowManyWords {


    void runApp() {
        String sentence = doInputs();
        int qntWords = wordsCount(sentence);
        printInfo(qntWords);
    }

    String doInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type sentence in one line used space");
        return sc.nextLine();
    }

    int wordsCount(String sentence) {
        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    void printInfo(int qntWords) {
        System.out.println("The number of words you typed: " + qntWords);
    }
}
