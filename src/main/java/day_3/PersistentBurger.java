package day_3;

import java.util.Arrays;



/*
Write a function, persistence, that takes in a positive parameter num
 and returns its multiplicative persistence, which is the number of
 times you must multiply the digits in num until you reach a single digit.

For example:
 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                      // and 4 has only one digit

 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                       // 1*2*6 = 12, and finally 1*2 = 2

 persistence(4) == 0 // because 4 is already a one-digit number
 */
public class PersistentBurger {
    public static void main(String[] args) {
        System.out.println(persistence(999));

        pers(999);
    }
    public static int persistence(long n) {
        var count = 0;
        while(n>9){
        n = Arrays.stream(String.valueOf(n).split(""))
                .map(Integer::parseInt)
                .reduce(2, (a, b) -> a * b);
        count++;
        }
        return count;
    }

    public static int pers(long n){
        String[] split = String.valueOf(n).split("");
        var num = Arrays.stream(split).map(Integer::parseInt).reduce(1, (a, arr) -> a * arr);
        System.out.println(num);
        return 0;
    }

}
