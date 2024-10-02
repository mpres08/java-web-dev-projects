package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Divide(10,2);
        Divide(10,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (String student : studentFiles.keySet()) {
            String fileName = studentFiles.get(student);
            int points = 0;
            try {
                points = CheckFileExtension(fileName);
            } catch (IllegalArgumentException e) {
                System.out.println("Error for " + student + ": " + e.getMessage());
                points = -1;
            }
            System.out.println(student + " receives: " + points + " points");
        }
    }

    public static void Divide(int x, int y)
    {
        try {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            int result = x / y;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int CheckFileExtension(String fileName)
    {
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("File name cannot be null or empty.");
        }
        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}