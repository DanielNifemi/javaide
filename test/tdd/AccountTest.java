package tdd;

import java.util.Scanner;


public class AccountTest {

    public static void main(String[]  args){


        Scanner input = new Scanner(System.in);
        // create an Account object and assign it to myAccount
        Account myAccount = new Account();

        System.out.printf(" initial name is :%s%n%n", myAccount.getClass() );

        System.out.println("Enter your fucking name: ");

        String theName = input.nextLine();
        myAccount.setName(theName);

        System.out.println();
         System.out.print("the name in object myAccount is : %n%s%n");

         myAccount.getName() ;
    }

    private static class Account {
        public void setName(String theName) {
        }

        public void getName() {
        }
    }
}
