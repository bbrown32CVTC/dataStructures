package edu.cuw.java.unit1;

import java.util.*;
public class Exercise1_1 {
    public static void main(String[] args) {

        //Part 1
        Scanner keyboard = new Scanner(System.in);
        Stack<String> input = new Stack<>();
        ArrayDeque<String> inputDeque = new ArrayDeque<>();
        String line = "";

        /*
        System.out.print("Enter 'X' to exit program, otherwise enter any other key and press enter to start: ");
        String line = keyboard.next();

        while (!line.equalsIgnoreCase("x")) {
            System.out.print("Enter a line of text and press enter: ");
            line = keyboard.next();
            if (!line.equalsIgnoreCase("x")) {
                input.push(line);
            }
        }

        if (!input.isEmpty()) {
            while (!input.isEmpty()) {
                System.out.println(input.pop());
            }
        }
         */

        //Part 2
        /*
        System.out.print("Enter 'X' to exit program, otherwise enter any other key and press enter to start: ");
        String line = keyboard.next();

        while (!line.equalsIgnoreCase("x")){

            System.out.println("Enter a line of text: ");
            line = keyboard.next();

            if (!line.equalsIgnoreCase("x")) {
                input.push(line);
            }

            if (input.size() >= 50) {
                System.out.println("Output: ");
                while (!input.isEmpty()) {
                    System.out.println(input.pop());
                }
            }
        }

        if (!input.isEmpty()) {
            while (!input.isEmpty()) {
              System.out.println(input.pop());
            }
        }
         */

        //Part 3
        /*
        int lineCount = 0;
        String lastLine = "";

        System.out.println("Enter 'X' to exit program.");

        while (!line.equalsIgnoreCase("x")) {
            System.out.print("Enter a line of text: ");
            line = keyboard.nextLine();

            if (line.length() == 0) {

                if (lineCount >= 42) {  //42 entries have been reached

                    if (inputDeque.size() >= 42) {
                        System.out.println(inputDeque.getFirst());  //Output first line
                    } else {
                        System.out.println(lastLine);  //Output line 42 entries prior
                    }

                } else {
                    System.out.println("That didn't count. Try again!");
                }

            } else {
                if (inputDeque.size() == 43) {
                    lastLine = inputDeque.getFirst();
                    inputDeque.removeFirst();
                }
                inputDeque.addLast(line);
                lineCount++;
            }
        }
         */

        //Part 4
        /*
        line = "";
        HashSet<String> uniqueLines = new HashSet<>();
        System.out.println("Enter 'X' to exit program.");

        while (!line.equalsIgnoreCase("x")) {
            line = keyboard.nextLine();

            if (!line.equalsIgnoreCase("x") && uniqueLines.add(line.toLowerCase())){
                System.out.println(line);
            }

        }
         */

        //Solution 5
        /*
        line = "";
        HashSet<String> uniqueLines = new HashSet<>();
        System.out.println("Enter 'X' to exit program.");

        while (!line.equalsIgnoreCase("x")) {
            line = keyboard.nextLine();

            if (!line.equalsIgnoreCase("x") && !uniqueLines.add(line.toLowerCase())){
                System.out.println(line);
            }

        }
         */

        //Solution 6
        /*
        HashSet<String> uniqueLines = new HashSet<>();
        List<String> sortedLines = new ArrayList<>();
        System.out.println("Enter 'X' to exit program.");

        while (!line.equalsIgnoreCase("x")) {
            line = keyboard.nextLine();

            if (!line.equalsIgnoreCase("x") && uniqueLines.add(line.toLowerCase())){
                sortedLines.add(line);
            }

        }

        //Sort the lines
        sortedLines.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
        for (String inputLine: sortedLines) {
            System.out.println(inputLine);
        }
         */


        //solution 7
        /*
        line = "";
        List<String> sortedLines = new ArrayList<>();
        System.out.println("Enter 'X' to exit program.");

        while (!line.equalsIgnoreCase("x")) {
            line = keyboard.nextLine();

            if (!line.equalsIgnoreCase("x")){
                sortedLines.add(line);
            }

        }

        //Sort the lines
        sortedLines.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
        for (String inputLine: sortedLines) {
            System.out.println(inputLine);
        }
         */


        //Solution 8
        /*
        line = "";
        int lineNumber = 0;
        ArrayList<String> evenLines = new ArrayList<>();
        ArrayList<String> oddLines = new ArrayList<>();

        System.out.println("Enter 'X' to exit program.");

        while (!line.equalsIgnoreCase("x")) {
            line = keyboard.nextLine();

            if (!line.equalsIgnoreCase("x")){
                if (lineNumber % 2 == 0) {
                    evenLines.add(line);
                } else {
                    oddLines.add(line);
                }
            }

            lineNumber++;
        }

        //Print even number lines
        for (String evenLine: evenLines) {
            System.out.println(evenLine);
        }

        //Print odd number lines
        for (String oddLine: oddLines) {
            System.out.println(oddLine);
        }
         */

        //Solution 9
        line = "";
        ArrayList<String> lines = new ArrayList<>();

        System.out.println("Enter 'X' to exit program.");

        while (!line.equalsIgnoreCase("x")) {
            line = keyboard.nextLine();

            if (!line.equalsIgnoreCase("x")){
                lines.add(line);
            }

        }

        //Randomize the line order
        Collections.shuffle(lines);

        //Print the lines in a random order
        for (String inputLine: lines) {
            System.out.println(inputLine);
        }


        keyboard.close();
    }
}
