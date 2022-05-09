import java.util.Scanner;

//pseudocode
//tell the user to input his score
//if score is greater than or equals to 90 and is less than or equals to 100 output A
//if score is greater than or equals to 80 and is less than 90 output B
//if score is greater than or equals to 70 and is less than 80 output C
//if score is greater than or equals to 60 and is less than 70 output D
//if score is less than 60 output F

public class Kata {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score to know your grade: ");

        int score = input.nextInt();
        System.out.println();


        if (score >=90 && score <= 100){
            System.out.println("your grade is A");
        }
        if (score >= 80 && score< 90) {
            System.out.println("your grade is B");
        }
        if (score >= 70 && score < 80) {
            System.out.println("your grade is C");
        }
        if (score >=60 && score < 70) {
            System.out.println("your grade is D");
        }
        if (score < 60) {
            System.out.println("your grade is F");
        }
    }
}
