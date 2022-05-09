package tdd;

public class LoopNumbers {
        public static void main(String[] args) {
            int number = nextInt();
            System.out.print("Even numbers from 1 to " + 20 + " are: \n");
            int a;
            for(a = 1; a <= 20; a++)
            {
                if(a % 2 == 0)
                {
                    System.out.print(a + "     ");
                }
            }
        }

    private static int nextInt() {
        return 0;
    }

}
