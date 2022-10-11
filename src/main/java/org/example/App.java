package org.example;

import java.util.Scanner;

public class App {
    public static void main (String[] args){

        System.out.println("Hello");
        System.out.println("Farhad!");
        //end of exercise 1

        //exercise 2 begin here!
        // assign a value to the variable
        // check if the year  is divisible by 400
        // display leap year
        // else  display error message
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt ();
        boolean resultYear = (year % 4 == 0) && (year%100 !=0);
        if (resultYear){
            System.out.println("leap year!");

        }else {
            System.out.println("Not leap year");
        }

        //End of exercise 2

        //exercise 3 begin here! using diff. methods
        //Sum begin here
        System.out.println("Summation!!!");
        System.out.println("Enter a first number:");
        int N1 = scanner.nextInt();
        //int N1 = 23;
        System.out.println("Enter a second number: ");
        int N2 = scanner.nextInt();
        //int N2 = 11;
        int result = N1 + N2;
        //System.out.println("23 + 11 = " + result);
        System.out.println(N1 +  "+" + N2 + "=" + result);

        //subtraction begin here!
        System.out.println("Subtraction!!!");
        System.out.println("Enter a first number:");
        int number1 = scanner.nextInt();
        //int number1 = 40;
        System.out.println("Enter a second number:");
        int number2 = scanner.nextInt();
        //int number2 = 24;
        int result1 = number1 - number2;
        //System.out.println("40 - 24 = " + result1);
        System.out.println(number1 + "-" + number2 + "=" + result1);

        // multiplication begin here
        System.out.println("Multiplication!!!");
        System.out.println("Enter a first number:");
        int No3 = scanner.nextInt();
        System.out.println("Enter a second number:");
        int No4 = scanner.nextInt();
        int result2 = No3 * No4;
        System.out.println(No3 + "*" + No4 + "=" + result2);

        //division begin here
        System.out.println("Division!!!");
        System.out.println("Enter a first number:");
        int No5 = scanner.nextInt();
        System.out.println("Enter a second number:");
        int No6 = scanner.nextInt();
        int result3 = No5 / No6;
        System.out.println(No5 + "/" + No6 + "=" + result3);

        //end of exercise 3

    }
}
