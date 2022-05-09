package tdd;

public class FactorialNumber {

    public static void main(String[]  args) {


        int v,factorial =  1;
        int number = 3;
        //(check factorial)
        for (v = 1;  v <= number ; v++){


            factorial = factorial*v;
        }
        System.out.println("factorial of" + number + " is " + factorial);
    }
}
