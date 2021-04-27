package day_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/*
Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
 */
public class CountingDuplicates {
    public static void main(String[] args) {
        duplicateCount("aabbcde");

    }
    public static int duplicateCount(String text) {
        int sum = 0;
        int ans = 0;
        var arr = Arrays.stream(Arrays.stream(text.split("")).toArray()).sorted().toArray();
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].equals(arr[i+1])) {
                ans += 1;
            }
            sum = ans;
        }

        return sum;
    }
}
