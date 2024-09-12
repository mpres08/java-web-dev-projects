package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> roster = new HashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.println("How many students do you want to add? ");
        int numStudents = input.nextInt();
        input.nextLine();

        for (int i= 0; i < numStudents; i++) {
            System.out.println("Enter student name: ");
            String name = input.nextLine();
            System.out.println("Enter student ID: ");
            int id = input.nextInt();
            input.nextLine();

            roster.put(id, name);
        }

        System.out.println("\nStudent Roster:");
        for (Map.Entry<Integer, String> entry : roster.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " - Name: " + entry.getValue());
        }

        input.close();
    }
}
