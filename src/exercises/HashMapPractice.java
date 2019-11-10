package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter student names (press ENTER twice to finish)");

        do {
            System.out.print("Student name: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newId = input.nextInt();
                students.put(newId, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        System.out.println("Student Roster: ");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Name: " + student.getValue());
            System.out.println("ID: " + student.getKey());
        }

    }
}
