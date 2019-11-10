package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numList.add(i);
        }

        int numTotal = 0;

        for (int i = 0; i < numList.size(); i++)
            if (numList.get(i) % 2 == 0) {
                numTotal += numList.get(i);
            }
        System.out.println(numTotal);

            ArrayList<String> fiveCharWords = new ArrayList<>();
            fiveCharWords.add("house");
            fiveCharWords.add("at");
            fiveCharWords.add("harry");
            fiveCharWords.add("henderson");
            fiveCharWords.add("sweet");
            fiveCharWords.add("ants");

            Scanner input = new Scanner(System.in);
           // int selectedLength;
            System.out.println("Enter a word length:");
            int selectedLength = input.nextInt();


            for (String word : fiveCharWords) {
                if (word.length() == selectedLength) {
                    System.out.println(word);
                }
            }

    }
}
