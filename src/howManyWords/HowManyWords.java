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
        for (int i = 0; i < words.length; i++) {
            if (sentence.charAt(i) == ' ' & sentence.charAt(i + 1) == ' ') {
                System.out.println("ATTENTION! You have 2 spaces between two words! Try again!");
                System.exit(0);
            } else if (sentence.charAt(0) == ' ') {
                System.out.println("Your sentence is starting with SPACE, try again!");
                System.exit(0);
            } else {
                count++;
            }
        }
        return count;
    }

    void printInfo(int qntWords) {
        System.out.println("The number of words you typed: " + qntWords);
    }
}
