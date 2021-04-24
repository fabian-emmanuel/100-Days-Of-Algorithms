package day_5;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.IntStream.range;

/*
The input is a string str of digits. Cut the string into chunks
(a chunk here is a substring of the initial string) of size sz
(ignore the last chunk if its size is less than sz).

If a chunk represents an integer such as the sum of the cubes
of its digits is divisible by 2, reverse that chunk;
otherwise rotate it to the left by one position.
Put together these modified chunks and return the result as a string.

If

sz is <= 0 or if str is empty return ""
sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".

Examples:
revrot("123456987654", 6) --> "234561876549"
revrot("123456987653", 6) --> "234561356789"
revrot("66443875", 4) --> "44668753"
revrot("66443875", 8) --> "64438756"
revrot("664438769", 8) --> "67834466"
revrot("123456779", 8) --> "23456771"
revrot("", 8) --> ""
revrot("123456779", 0) --> ""
revrot("563000655734469485", 4) --> "0365065073456944"


public static String revRot(String strng, int sz) {
        if ((sz==0) || (strng == "") || (sz > strng.length())) return "";  // INVALID CASES -> Return empty string

        String result = "";                                                // this string will contain the result to be returned

        for (int i = 0; i < (strng.length()/sz); i++){                     // for each chunk of sz elements
            String chunk = strng.substring(i*sz, i*sz + sz);
            int digitSum = 0;
                                                                           // Because our final goal is to determine if the digtSum is odd or even
            for (int j = 0; j < sz; j++){                                  // There is no need of summing the cubes of the numbers
                digitSum += Character.getNumericValue(chunk.charAt(j));    // odd^n remains odd, even^n remains even
            }                                                              // so the proportion of even and odd numbers remains the same

            if ((digitSum % 2) == 0){                                      // REVERSE CHUNK
                for (int k = sz-1; k >= 0; k--){                           //   by adding every character of the chunk to the result from right to left
                    result += chunk.charAt(k);
                }
            }else{                                                         // ROTATE CHUNK TO THE LEFT BY ONE POSITION
                result += chunk.substring(1) + chunk.charAt(0);            //   by adding the chunk to the result with its first character in the end
            }
        }

        return result;



  public static String revRot(String str, int sz) {
        Function<String, String> prd = s -> s.chars().map(c -> c - '0').sum() % 2 == 0 ?
                new StringBuilder(s).reverse().toString() : s.substring(1) + s.substring(0, 1);

        return Arrays.stream(str.split("(?<=\\G.{" + sz + "})"))
                .filter(s -> s.length() == sz)
                .map(s -> prd.apply(s))
                .collect(Collectors.joining());
    }
 */
public class ReverseOrRotate {
    public static void main(String[] args) {
        String str = "123456987654";
        var seperated = List.of(str.split(""));

        System.out.println(seperated);

        String x = Arrays.toString(new String[]{str.substring(6)});
        System.out.println(x);





    }
    public static String revRot(String strng, int sz) {
        if (strng.isEmpty() || sz <= 0 || sz > strng.length()) return "";
        var ans = new StringBuilder();
        for (int i = 0; i <= strng.length() - sz; i += sz) {
            var chunk = new StringBuilder(strng.substring(i, sz + i));
            if (range(0, sz).mapToDouble(j -> Math.pow(chunk.charAt(j) - 48., 3)).sum() % 2 > 0) {
                ans.append(chunk.substring(1, sz)).append(chunk.charAt(0));
            } else {
                ans.append(chunk.reverse());
            }
        }
        return ans.toString();
    }
}
