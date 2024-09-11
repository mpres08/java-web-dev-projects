package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class WordsList {
    public static void main(String[] arg) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("grape");
        words.add("melon");
        words.add("berry");

        printFiveLetterWords(words);
    }

    public static void printFiveLetterWords(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        for (String word : words) {
            if (word.length() == numChars) {
                System.out.println(word);
            }
        }
        input.close();
    }
}
