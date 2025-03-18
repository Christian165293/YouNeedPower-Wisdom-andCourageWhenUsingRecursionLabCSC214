package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleNumberCalculatorTest {

    @Test
    void testValue() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        // Test case for n = 1
        assertEquals(1, calculator.value(1));

        // Test case for n = 2
        assertEquals(3, calculator.value(2));

        // Test case for n = 3
        assertEquals(6, calculator.value(3));

        // Test case for n = 4
        assertEquals(10, calculator.value(4));

        // Test case for n = 5
        assertEquals(15, calculator.value(5));
    }

    @Test
    void testAdd() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        // Test case for adding triangle numbers of 3 and 4
        assertEquals(16, calculator.add(3, 4));

        // Test case for adding triangle numbers of 5 and 2
        assertEquals(18, calculator.add(5, 2));

        // Test case for adding triangle numbers of 1 and 1
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void testSubtract() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        // Test case for subtracting triangle numbers of 4 and 3
        assertEquals(4, calculator.subtract(4, 3));

        // Test case for subtracting triangle numbers of 5 and 2
        assertEquals(12, calculator.subtract(5, 2));

        // Test case for subtracting triangle numbers of 3 and 1
        assertEquals(5, calculator.subtract(3, 1));
    }

}