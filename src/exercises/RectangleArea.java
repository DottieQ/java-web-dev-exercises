package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your rectangle:");
        int rectangleLength = input.nextInt();
        System.out.println("Enter the width of your rectangle:");
        int rectangleWidth = input.nextInt();
        int area = rectangleLength * rectangleWidth;
        System.out.println(area);
    }
}
