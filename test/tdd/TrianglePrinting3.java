package tdd;

public class TrianglePrinting3 {
    public static void main(String[] args){
        for(int count = 0; count < 10; count++){
            for(int commit = 1; commit< count+1;commit++)
                System.out.println(" ");
            for (int globe = 10; globe> count;globe--)
                System.out.println("*");
            System.out.println();
        }
    }
}
