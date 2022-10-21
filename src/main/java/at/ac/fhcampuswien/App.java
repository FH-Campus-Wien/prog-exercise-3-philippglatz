package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

// Task 1:

    public static void oneMonthCalendar(int numberDays, int firstDay) {
        int count = 0;
        int row;
        if (firstDay != 1) {
            for (int j = 1; j < firstDay; j++)       // dadurch erzeugt man den Abstand
                System.out.print("   ");
        }
        row = firstDay - 1;
        for (int k = 1; k <= numberDays; k++) {
            row++;
            count++;
            if (count < 10)
                System.out.print(" " + count + " ");
            else
                System.out.print(count + " ");
            if (count != numberDays && row == 7) {   // dadurch fängt man immer eine neue Zeile an
                System.out.println();
                row = 0;                            // Zeile auf 0 setzen wieder
            }
        }
        System.out.println();
    }

// Task 2:

    public static long[] lcg(long seed) {
        int a = 1103515245;
        int c = 12345;
        long m = (long) Math.pow(2, 31);
        long[] number = new long[10];
        number[0] = (a * seed + c) % m;

        for (int k = 1; k < number.length; k++) {
            number[k] = (a * number[k - 1] + c) % m;
        }
        return number;

    }

// Task 3:

    public static void guessingGame(int numberToGuess) {
        Scanner scan = new Scanner(System.in);
        int number;

        for (int k = 1; k <= 10; k++) {
            System.out.print("Guess number " + k + ": ");
            number = scan.nextInt();

            if (k == 10) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            }
            if (number < numberToGuess) {
                System.out.println("The number AI picked is higher than your guess.");
            }
            if (number > numberToGuess) {
                System.out.println("The number AI picked is lower than your guess.");
            } else if (number == numberToGuess) {
                System.out.println("You won wisenheimer!");
                break;
            }
        }
    }

    public static int randomNumberBetweenOneAndHundred() {
        Random number = new Random();
        return number.nextInt(100) + 1;
    }

// Task 4:

    public static boolean swapArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;
        int temp;

        for (int k = 0; k < array1.length; k++) {
            temp = array1[k];
            array1[k] = array2[k];
            array2[k] = temp;
        }
        return true;
    }

// Task 5:

// Task 6:

    public static int checkDigit(int[] array1){
        int sum = 0;
        int rest;

        for (int k = 0; k < array1.length; k++){
            sum += array1[k] * (k + 2);
        }
        rest = sum % 11;
            if (11 - rest == 10)
                return 0;
            else if (11 - rest == 11)
                return 5;

            return 11 - rest;
    }

    public static void main(String[] args) {

        //Task 1 oneMonthCalendar

            oneMonthCalendar(23,2);

        //Task 2 Pseudo Random Numbers

            lcg(12345);

        //Task 3 Guessing Game

            guessingGame(randomNumberBetweenOneAndHundred());

        //Task 4 Swap Arrays

            int[] array1 = {1,2,3,4,5};
            int[] array2 = {100,99,98,97,96};
            swapArrays(array1,array2);

        //Task 5 CamelCase

        //Task 6 Check Digit
            int[] digits = {5,1,7,9,4};
            checkDigit(digits);

    }
}