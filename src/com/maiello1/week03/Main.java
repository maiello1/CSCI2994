package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.Scanner;


public class Main {
    static double getTemp() {
        System.out.println("Enter a temperature.");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return Double.parseDouble(input);
    }
    static double fToC(double f) {
        return 5.0/9 * (f - 32);
    }
    static void displayTemp(double temp){
        System.out.println("The temperature is: " + temp);
    }

    public static void main(String[] args) {
        Double userInput = getTemp();
        while (userInput >= -460){
            displayTemp(fToC(userInput));
            userInput = getTemp();
        }
    }
}
