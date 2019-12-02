package org.launchcode.java.studios.charactercount;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {

        String quote = "If the product of two terms is zero then common sense says at least one of " +
                "the two terms has to be zero to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the equation to " +
                "equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInQuote = quote.toCharArray();

        HashMap<Character, Integer> characterCount = new HashMap<>();

//        for(int i = 0; i < charactersInQuote.length; i++) {
//            if(characterCount.containsKey(charactersInQuote[i])) {
//                int charCount = i + 1;
//                characterCount.put(charactersInQuote[i], charCount);
//            } else {
//                int charCountPlaceHolder = 0;
//                characterCount.put(charactersInQuote[i], charCountPlaceHolder);
//            }
//        }

        // SECOND TRY

        for(int i = 0; i < charactersInQuote.length; i++) {
            if (characterCount.containsKey(charactersInQuote[i])) {
               // for (Map.Entry<Character, Integer> characters : characterCount.entrySet()) {
                    int charCountAdd = characterCount.get(charactersInQuote[i]) + 1;
                    characterCount.put(charactersInQuote[i], charCountAdd);
//                }
            } else {
                int charCountStart = 1;
                characterCount.put(charactersInQuote[i], charCountStart);
            }






//            for (Map.Entry<Character, Integer> characters : characterCount.entrySet()) {
//                if (characterCount.containsKey(charactersInQuote[i])) {
//                    int charCountAdd = characters.getValue() + 1;
//                    characterCount.put(charactersInQuote[i], charCountAdd);
//                }
//            }
        }

        // SOLUTION




//        for(Map.Entry<Character, Integer> characters : characterCount.entrySet()) {
//            System.out.println(characters.getKey() + ":" + characters.getValue());
//        }

        for(char c : characterCount.keySet()) {
            System.out.println(c + ": " + characterCount.get(c));
        }


    }
}
