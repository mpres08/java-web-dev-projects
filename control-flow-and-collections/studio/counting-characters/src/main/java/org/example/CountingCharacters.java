package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into " +
                "a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s " +
                "pretty straightforward from there.";
        char[] charactersInString = quote.toCharArray();
        HashMap<String, Integer> charCount = new HashMap<>();
            for (int i = 0; i < charactersInString.length; i++) {
                if (!charCount.containsKey(charactersInString[i])) {
                    charCount.put(String.valueOf(charactersInString[i]), 1);
                } else {
                    int tempInt = charCount.get(charactersInString[i]);
                    tempInt++;
                    charCount.put(String.valueOf(charactersInString[i]), tempInt);
                }
            }
        for(Map.Entry<String, Integer> pair:charCount.entrySet()) {
            System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
        }
    }
}