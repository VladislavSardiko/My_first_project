package lv.acodemy.classroom;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {


        // byte data type
        byte myCurrentAege = 34;
        System.out.println(myCurrentAege);

        //short data type
        short salaryPerMonth = 1000;
        System.out.println(salaryPerMonth);

        // char short type

        char firstNameLetter = 86; // "V"
        System.out.println(firstNameLetter);

        // in data type
        int dateOfBirth = 130289;
        System.out.println(dateOfBirth);

        // long data type
        long populationOfLatvian = 1800000;
        System.out.println(populationOfLatvian);

        //float data type
        float lapTime = 32.30F;
        System.out.println(lapTime);

        // double data type
        double weight = 82.5;
        System.out.println(weight);

        //boolean is; has;
        boolean isWinter = false;
        boolean isSpring = true;
        boolean hasApples = true;

        // String
        String name = "Vladislav";
        String surename = "Sardiko";

        //Concatenation
        String fullName = name + " " + surename;
        System.out.println(fullName);

        String fullNameWithAge = fullName + myCurrentAege;
        //System.out.println ("Vladislav Sardiko34");
        //Vladislav Sardiko34
        System.out.println(fullNameWithAge);

        System.out.printf("My full name is %s. I am %d years old.%n", fullName, myCurrentAege);
        System.out.printf("My full name is %s. I am %d years old.\n", fullName, myCurrentAege);

        //*
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        System.out.println(10 * 20);
        System.out.println(a * b);
        System.out.println("20 * 10");

        //division
        double result = (double) a / b;
        System.out.println(result);

        //%
        int number = 10 % 9 ;
        System.out.println(number);

        int[] numbers = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numbers));

        for (int num : numbers) {
            if(num % 2 == 0) {
                System.out.println("This is even number:"+ num);
            }
        }





    }
}
