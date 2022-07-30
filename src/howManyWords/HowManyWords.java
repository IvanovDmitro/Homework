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
        String[] words = sentence.split(" ");
        int count = 0;
        for (String word : words) {
            if (!word.equals("")) {
                count++;
            }
        }
        return count;
    }

    void printInfo(int qntWords) {
        System.out.println("The number of words you typed: " + qntWords);
    }
}
