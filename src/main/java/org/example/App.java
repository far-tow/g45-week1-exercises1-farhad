package org.example;

import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {

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
        int year = scanner.nextInt();
        boolean resultYear = (year % 4 == 0) && (year % 100 != 0);
        if (resultYear) {
            System.out.println("leap year!");

        } else {
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
        System.out.println(N1 + "+" + N2 + "=" + result);

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

        //begin of exercise 4
        System.out.println("Choose 3 number to see the average of them!!!");
        System.out.println("Write the first number:");
        int A1 = scanner.nextInt();
        System.out.println("Write the second number:");
        int A2 = scanner.nextInt();
        System.out.println("And write the third one:");
        int A3 = scanner.nextInt();
        int aresult = (A1 + A2 + A3) / 3;
        System.out.println("(" + A1 + "+" + A2 + "+" + A3 + ")" + "/" + "3" + "=" + aresult);

        //End of exercise 4

        //Begin of exercise 5

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String Name = sc.nextLine();
        System.out.println("Hello" + " " + Name + " " + "!");

        //End of exercise 5

        //Begin of exercise 6

        //End of exercise 6

        //Begin of exercise 7

        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = in.nextInt();
        int S = seconds % 60;
        int H = seconds / 60;
        int M = H % 60;
        H = H / 60;
        System.out.print(H + ":" + M + ":" + S);
        System.out.print("\n");

        //End of exercise 7

        //Begin of exercise 8

        int randoNumber = generateRandoNumber();
        // define a while loop with its condition

        while (true) {
            System.out.println("Guess a number:");
            int guessNumber = scanner.nextInt();
            if (guessNumber < randoNumber) {
                System.out.println("your guess is smaller than Random number");
            } else if (guessNumber > randoNumber) {
                System.out.println("your guess is greater than Random number");
            } else {
                System.out.println("Congratulation!!! your guess number is right");
                break;
            }

        }


    }

    public static int generateRandoNumber() {
        int min = 1;
        int max = 500;

        System.out.println("Choose a random number between" + " " + min + " " + "and" + " " + max);
        int random = (int) (Math.random() * max - min + 1) + min;
        //Move next line System.out.println(random); if you want to NOT show the randomnumber to user!
        //System.out.println(random);
        return random;
    }
    //End of exercise 8

}







