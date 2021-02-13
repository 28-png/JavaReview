import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

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
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '_' || builder.charAt(i) == '-') {
                builder.deleteCharAt(i);
                builder.replace(i, i + 1, String.valueOf(Character.toUpperCase(builder.charAt(i))));
            }
        }

        return builder.toString();

    }

// You probably know the "like" system from Facebook and other pages. People can "like"
// blog posts, pictures or other items. We want to create the text that should be displayed next to
// such an item. Implement a function likes :: [String] -> String, which must take in input array,
// containing the names of people who like an item. It must return the display text as shown in the examples:
// likes {} // must be "no one likes this"
//likes {"Peter"} // must be "Peter likes this"
//likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
//likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
//likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
public static String whoLikesIt(String... names) {
        String add = "no one likes this";
        if(names == null || Arrays.toString(names).isEmpty()) {
           return add;
        }
        for(int i = 0; i<names.length; i++) {
            System.out.println(names[i]);
        }
        return "";

}

   public static int sockMerchant(int n, int[] ar) {
        int count = 0;
        for(int i = 0; i < ar.length; i++)
            if(ar[i] == ar[i])
                    count++;
        return count;
    }



    public static void main(String[] args) {
        System.out.println(sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
//        System.out.println(whoLikesIt("matt", "cory"));
//        System.out.println(toCamelCase("the-stealth-warrior"));
//        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
//        System.out.println(Arrays.toString(arrayOfMultiples(6, 10)));
//        System.out.println(isEqual(1, 1));
}



}










