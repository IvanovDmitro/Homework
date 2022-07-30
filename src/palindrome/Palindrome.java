package palindrome;

import java.util.Scanner;

public class Palindrome {


    void runApp() {
        String word = doInputs();
        boolean result = isPalindrome(word);
        printInfo(result);
    }

    String doInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the word");
        return sc.nextLine();
    }

    boolean isPalindrome(String word) {
        int j = word.length();
        if (word.isEmpty()) {
            return false;
        }
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) == word.charAt(j - 1)) {
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    void printInfo(boolean result) {
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}



