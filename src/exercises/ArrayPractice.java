package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] practiceArray = {1, 1, 2, 3, 5, 8};

        for (int i : practiceArray) {
            System.out.println(i);
        }

        for (int i = 0; i < practiceArray.length; i++) {
            if (practiceArray[i] % 2 == 1) {
                System.out.println(practiceArray[i]);
            }

        }

        String fox = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] newFox = fox.split(" ");
        System.out.println(Arrays.toString(newFox));

        String[] anotherNewFox = fox.split("\\.");
        System.out.println(Arrays.toString(anotherNewFox));

    }
}
