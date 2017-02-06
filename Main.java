package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void displayElements(List<String> array) {
        for (String element : array) {
            System.out.println(element);
        }
    }
    static List<String> addElement (List<String> existingArray, String newTask){
        existingArray.add(newTask);
        return existingArray;
    }
    static List<String> removeElement(List<String> existingArray, int removeItem) {
        existingArray.remove(removeItem);
        return existingArray;
    }
    static List<String> updateElement(List<String> existingArray, int updateTask, String newDescription){
        existingArray.set(updateTask, newDescription);
        return existingArray;
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        List<String> array = new ArrayList<>();

        int answer = 1;
        while (answer!=0) {
            System.out.println("Please choose an option:\n" +
                    "(1) Add a task.\n" +
                    "(2) Remove a task.\n" +
                    "(3) Update a task.\n" +
                    "(4) List all tasks.\n" +
                    "(0) Exit.");
            int option = scan.nextInt();

            if (option == 1) {
                System.out.println("Enter a description of the new task.");
                scan.nextLine();
                String newTask = scan.nextLine();
                array = addElement(array, newTask);
                displayElements(array);
            }
            else if (option == 2) {
                System.out.println("Enter the index of the item to remove.");
                int removeItem = scan.nextInt();
                array = removeElement(array, removeItem);
                displayElements(array);
            }
            else if (option == 3) {
                System.out.println("Enter the index of the task to update.");
                int updateTask = scan.nextInt();
                System.out.println("Enter the new description of the task.");
                scan.nextLine();
                String newDescription = scan.nextLine();
                array = updateElement(array, updateTask, newDescription);
                displayElements(array);
            }
            else if (option == 4) {
                displayElements(array);
            }
            else {
                answer = 0;
                System.exit(0);

            }
        }
    }
}
