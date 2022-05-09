package tdd;

public class TrianglePrinting2 {

    public static void main(String[] args){
        for(int count = 11; count >= 0; count--){
            for(int g=0; g< count-1;g++)

                System.out.println("*");
            System.out.println();
        }
    }
}
