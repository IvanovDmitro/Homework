package palindrome;

import java.util.Scanner;

public class Palindrome {

    String word;
    String result;

    void runApp() {
        doInputs();
        isPalindrome();
        printInfo();
    }

    void doInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the word");
        word = sc.nextLine();
    }

    void isPalindrome() {
        int j = word.length();
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) == word.charAt(j - 1)) {
                result = "true";
                j--;
            } else if (word.charAt(i) != word.charAt(j - 1)) {
                result = "false";
                break;
            }
        }
    }

    void printInfo() {
        switch (result) {
            case "true" -> System.out.println("Palindrome");
            case "false" -> System.out.println("Not palindrome");
        }
    }
}

