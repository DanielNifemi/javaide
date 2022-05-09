package tdd;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = null;
        int number = sc.nextInt();
        System.out.println("Even numbers from 1 to " + number + " are: \n");
        int a;
        for(a = 1; a <= number; a++)
        {
            if(a % 2 == 0)
            {
                System.out.print(a + "\n");
            }
        }
    }
}
