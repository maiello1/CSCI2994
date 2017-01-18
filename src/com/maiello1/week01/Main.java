package com.maiello1.week01;

/**
 * Created by maiello1 on 1/17/17.
 */
public class Main {

public static void main(String[] args) {
   String cityName = "Columbus";
   int zipCode = 43215;
   double[] temp = {32, 25, 27, 40, 45};
   double average = (temp[0] + temp[1] + temp[2] + temp[3] + temp[4]) / 5;

    System.out.println("City = " + cityName);
    System.out.println("Zip = " + zipCode);
    System.out.println("Average High Temperature = " + average);
}
}
