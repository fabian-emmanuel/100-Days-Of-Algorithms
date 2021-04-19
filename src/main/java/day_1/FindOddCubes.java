package day_1;

import java.util.Arrays;


/*
Find the sum of the odd numbers within an array, after cubing the initial integers.
The function should return undefined/None/nil/NULL if any of the values aren't numbers.

Note: There are ONLY integers in the JAVA and C# versions of this Kata.
 */
public class FindOddCubes {
    public static void main(String[] args) {
        System.out.println(cubeOdd(new int[] {1, 2, 3, 4}));
    }
    public static int cubeOdd(int[] arr) {
        return Arrays.stream(arr)
                .map(n -> n*n*n)
                .filter(n -> n % 2 != 0)
                .sum();
    }
}
