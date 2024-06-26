import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorsTest {
    PrimeFactor primeFactor;

    @BeforeEach
    void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    void testPrimeFactorOf1() {
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }
    @Test
    void testPrimeFactorOf2() {
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }
    @Test
    void testPrimeFactorOf3() {
        assertEquals(Arrays.asList(3), primeFactor.of(3));
    }
    @Test
    void testPrimeFactorOf4() {
        assertEquals(Arrays.asList(2, 2), primeFactor.of(4));
    }
    @Test
    void testPrimeFactorOf6() {
        assertEquals(Arrays.asList(2, 3), primeFactor.of(6));
    }
    @Test
    void testPrimeFactorOf8() {
        assertEquals(Arrays.asList(2, 2, 2), primeFactor.of(8));
    }
    @Test
    void testPrimeFactorOf10() {
        assertEquals(Arrays.asList(2, 5), primeFactor.of(10));
    }
}