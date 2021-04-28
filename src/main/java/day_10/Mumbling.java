package day_10;

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("abcd")); // "A-Bb-Ccc-Dddd"
        System.out.println(accum("RqaEzty")); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        System.out.println(accum("cwAt")); // "C-Ww-Aaa-Tttt"
    }

    public static String accum(String s) {
        var str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            str.append('-').append(Character.toUpperCase(s.charAt(i)));
            for (int j = 0; j < i; j++) {
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return str.substring(1);
    }
}
