package tdd;

public class TrianglePrinting1 {


    public static void main(String[] args){

        for(int count = 0; count < 10; count++){

            for(int a = 0; a < count + 1; a++)

                System.out.println("*");
            System.out.println();
        }
    }
}
