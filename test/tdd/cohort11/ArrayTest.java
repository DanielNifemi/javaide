package tdd.cohort11;


import java.util.Scanner;

public class ArrayTest {


    public static void main(String[] args) {
        int[] myArray = new int[5];
        int[] myArray2 = {10, 20, 33, -6, -7};
        // String[] stringArray = new String[5];
        // String[] stringArray2 = {"Like", "WTF", "Shit"};

        Scanner input = new Scanner(System.in);
        // System.out.println("My array length is" +myArray.length);
        // System.out.println("My array length is" +myArray2.length);
        // System.out.println ("stringArray length is" +stringArray.length);
        //System.out.println(" stringArray length is" +stringArray2.length);

        //System.out.println("my stringArray at last index  is " +stringArray2[stringArray2.length -2]);


        //System.out.println("my array at 0 is " +myArray[0]);
        //myArray[0] = 0;
        //System.out.println("my array at 2 is " +myArray[2]);
        //myArray[1]  = 23;
        //System.out.println("my array at 3 is " +myArray[3]);
        // myArray[3] = 45;


//        myArray = new int[]{10, 20, 33, -6, -7};
//        int sum = 0;
//        System.out.println("Enter the elements of the array one by one ");
//
//        for(int i=0; i< myArray.length; i++){
//            sum = sum + myArray[i];
//        }
//        System.out.println("Elements of the array are: " + Arrays.toString(myArray));
//        System.out.println("Sum of the elements of the array " + sum);

        myArray = new int[]{1, 3, 4, 778, 341, 45, -899};
        for (int i = 0; i < myArray.length; i++) ;
        int RandomIndex = (int) (Math.random() * 10);
        try {
            int randomIndex = (int) (Math.random() * 10);
                System.out.println("array at random index  "  +randomIndex+  " is "  +myArray[randomIndex]);
        } catch (ArrayIndexOutOfBoundsException error){
            System.out.println("Invalid index encountered");
        }
    }
}
