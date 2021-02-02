import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Program {
//    first challenge in four months
    public static int[] arrayOfMultiples(int num, int length) {
        int[] bucket = new int[length];
        for (int x = 0; x < length; x++)
            bucket[x] = num * (x+1);

            return bucket;
    }

//    second challenge
public static boolean isEqual(int num1, int num2) {
    return num1 == num2;
}

//third challenge
//Write a function that accepts an array of 10 integers (between 0 and 9),
// that returns a string of those numbers in the form of a phone number.
//Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
    public static String createPhoneNumber(int[] numbers) {
     return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4],
             numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

//    Complete the method/function so that it converts dash/underscore
//    delimited words into camel casing.
//    The first word within the output should be capitalized
//    only if the original word was capitalized (known as Upper Camel Case,
//    also often referred to as Pascal case).
// toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
    static String toCamelCase(String s){
        s = s.substring(0, 1).toUpperCase()
                + s.substring(1);
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '_' || builder.charAt(i) == '-') {

                builder.deleteCharAt(i);
                builder.replace(
                        i, i + 1,
                        String.valueOf(
                                Character.toUpperCase(
                                        builder.charAt(i))));
            }
        }

        return builder.toString();

    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
//        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
//        System.out.println(Arrays.toString(arrayOfMultiples(6, 10)));
//        System.out.println(isEqual(1, 1));
}


}










