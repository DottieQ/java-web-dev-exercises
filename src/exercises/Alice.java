package exercises;

import java.util.Scanner;


public class Alice {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search term:");
        String term = input.nextLine();
        String aliceCheck = alice.toLowerCase();
        if (aliceCheck.contains(term.toLowerCase())) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("Term length: " + term.length());
        System.out.println("Term index: " + alice.indexOf(term));
        String startAlice = alice.substring(0, alice.indexOf(term));
        String endAlice = alice.substring(alice.indexOf(term) + term.length(), alice.length());
        System.out.println(startAlice + endAlice);
    }
}
