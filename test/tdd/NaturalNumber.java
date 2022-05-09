package tdd;

public class NaturalNumber {

    public static void main(String[] args){
             // int w, num = 10 , sum = 0;
        //for(w=1;w <=; ++w)
        //System.out.println("sum of fist ten natural numbers is ="+sum")

        int number = 1;
        int sum = 0;
        while (number <= 10){
            System.out.println(number);
            sum = sum + number;
            number = number + 1;
        }
        System.out.println("sum =" + sum);
    }
}
