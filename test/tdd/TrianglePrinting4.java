package tdd;

public class TrianglePrinting4 {
    public static void main(String[] args){
        for(int count = 10; count > 0; count--){
            for(int commit = 0; commit< count-1;commit++)
                System.out.println(" ");
            for (int globe = 10; globe> count-1;globe--)
                System.out.println("*");
            System.out.println();
        }
    }
}

