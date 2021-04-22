package day_2;

import java.util.Arrays;

/*
Build a function that returns an array of integers from n to 1 where n>0.
Example : n=5 --> [5,4,3,2,1]

 */
public class Sequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(10)));
        System.out.println(Arrays.toString(reverse(20)));
        System.out.println(Arrays.toString(reverse(16)));
        System.out.println(Arrays.toString(reverse(14)));
        System.out.println(Arrays.toString(reverse(124)));
        System.out.println(Arrays.toString(reverse(44)));
        System.out.println(Arrays.toString(reverse(85)));
        System.out.println(Arrays.toString(reverse(113)));
        System.out.println(Arrays.toString(reverse(103)));
    }
    public static int[] reverse(int n){
        var arr = new int[n];
        for(int i=n; i>0; i--) arr[n-i] = i;
        return arr;
    }
}
