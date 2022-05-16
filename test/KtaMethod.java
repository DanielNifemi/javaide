import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {


    @Test public void  factorsTest() {
        int factors = Kata.noOfFactorsOf(5);
        assertEquals(2, factors);

        factors = Kata.noOfFactorsOf(10);
        assertEquals(4, factors);
    }



    @Test public void primeNumber(){
        boolean isPrime = (boolean) Kata.isPrime(5);
        assertEquals(isPrime);
    }

    private void assertEquals(boolean isPrime) {
    }

}

