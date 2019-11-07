package exercises;

import java.util.Scanner;

public class Gas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven:");
        int miles = input.nextInt();
        System.out.println("Enter the number of gallons of gas used:");
        int gasUsed = input.nextInt();
        int mpg = miles/gasUsed;
        System.out.println(mpg);
    }
}
