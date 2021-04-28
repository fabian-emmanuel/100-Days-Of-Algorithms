package day_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.LongStream.of;
import static java.util.stream.LongStream.rangeClosed;

/*
You have to search all numbers from inclusive 1 to inclusive a given number x,
that have the given digit d in it.
The value of d will always be 0 - 9.
The value of x will always be greater than 0.

You have to return as an array

the count of these numbers,
their sum
and their product.

For example:
x = 11
d = 1
->
Numbers: 1, 10, 11
Return: [3, 22, 110]

If there are no numbers, which include the digit, return [0,0,0].

Have fun coding it and please don't forget to vote and rank this kata! :-)

 */
public class NumbersWithThisDigit {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(NumbersWithDigitInside(10, 2)));

    }

    public static long[] NumbersWithDigitInside(long x, long d) {
        long[] nums = rangeClosed(1, x).filter(i -> ("" + i).contains(""+d)).toArray();
        System.out.println(Arrays.toString(nums));
       /* var list = new ArrayList<>();
        for(int i=1;i<=x;i++){
        System.out.println(i);
        list.add(i);
        }
        System.out.println(list.stream().toString().);
       // System.out.println(list);
        long[] nums = rangeClosed(1, x).filter(i -> ("" + i).contains("" + d)).toArray();
        return new long[] {nums.length, of(nums).sum(), of(nums).reduce((a, b) -> a * b).orElse(0L)};
    */
        return null;
    }
}
