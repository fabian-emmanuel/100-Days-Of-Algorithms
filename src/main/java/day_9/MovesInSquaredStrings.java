package day_9;

import java.util.Arrays;
import java.util.function.Function;

/*
This kata is the first of a sequence of four about "Squared Strings".
You are given a string of n lines, each substring being n characters long: For example:
s = "abcd\nefgh\nijkl\nmnop"
We will study some transformations of this square of strings.

Vertical mirror: vert_mirror (or vertMirror or vert-mirror)
vert_mirror(s) => "dcba\nhgfe\nlkji\nponm"
Horizontal mirror: hor_mirror (or horMirror or hor-mirror)
hor_mirror(s) => "mnop\nijkl\nefgh\nabcd"
or printed:

vertical mirror   |horizontal mirror
abcd --> dcba     |abcd --> mnop
efgh     hgfe     |efgh     ijkl
ijkl     lkji     |ijkl     efgh
mnop     ponm     |mnop     abcd

Task:
Write these two functions
and

high-order function oper(fct, s) where

fct is the function of one variable f to apply to the string s (fct will be one of vertMirror, horMirror)

Examples:
s = "abcd\nefgh\nijkl\nmnop"
oper(vert_mirror, s) => "dcba\nhgfe\nlkji\nponm"
oper(hor_mirror, s) => "mnop\nijkl\nefgh\nabcd"
Note:
The form of the parameter fct in oper changes according to the language. You can see each form according to the language in "Sample Tests".

Bash Note:
The input strings are separated by , instead of \n. The output strings should be separated by \r instead of \n. See "Sample Tests".
 */
public class MovesInSquaredStrings {
    public static void main(String[] args) {
        var s = "abcd\nefgh\nijkl\nmnop";
        var sa = "world";
        var a= new StringBuilder(sa).reverse().toString();
        System.out.println(a);

        System.out.println(horMirror(s)); //"mnop\nijkl\nefgh\nabcd"
        System.out.println(vertMirror(s));//"dcba\nhgfe\nlkji\nponm"
        System.out.println(oper(MovesInSquaredStrings::vertMirror, s)); //"dcba\nhgfe\nlkji\nponm"
        System.out.println(oper(MovesInSquaredStrings::horMirror, s)); //"mnop\nijkl\nefgh\nabcd"


    }
    public static String vertMirror (String strng) {
        var ver = new StringBuilder();
        String[] arr = strng.split("\n");

        for (int i = arr.length - 1; i >= 0; i--){
            ver.append(arr[i]);
            if (i != 0) {
                ver.append("\n");
            }
        }
        return ver.reverse().toString().trim();

    }
    public static String horMirror (String strng) {
        var str = new StringBuilder();
        String[] arr = strng.split("\n");

        for (int i = arr.length - 1; i >= 0; i--){
            str.append(arr[i]);
            if (i != 0) {
                str.append("\n");
            }
        }
        return str.toString();
    }
    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}
