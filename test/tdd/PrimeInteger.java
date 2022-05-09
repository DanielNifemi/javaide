package tdd;

import java.util.Scanner;


public class PrimeInteger {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Enter positive integer:");
        int num = input.nextInt();


        if(num < 1)
            System.out.println("Input a number bigger than 1" + "do the program again");

         else if(num == 2)
            System.out.print("its a prime number");

         else if(num % 2 == 0)
             System.out.print("its not a prime number");
        }
    }


