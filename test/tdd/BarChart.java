package tdd;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        BarChart asterik = new BarChart();

        int [] dn = new int[5];
        Scanner input = new Scanner(System.in);
        for (int w = 0; w < 5; w++) {
            System.out.println("Enter a number between  one to thirty:");
            dn[w] = input.nextInt();
        }
        input.close();
        asterik.asterikPower(dn);
    }

    private void asterikPower(int[] dn) {
       for (int w= 0; w <dn.length ; w++){
           System.out.println("*");
       }
       System.out.println();
    }

}
