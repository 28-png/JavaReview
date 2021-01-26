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
        int[] firstHalf = Arrays.copyOfRange(numbers, 0, numbers.length/3);
        int[] secondHalf = Arrays.copyOfRange(numbers, 3, numbers.length);
        String answer = Arrays.toString(firstHalf);
        String answer2 = Arrays.toString(secondHalf);
        answer = answer.substring(1, answer.length() - 1);
        answer2 = answer2.substring(1, answer2.length() - 1);
        String firstAnswer = answer.replaceAll("[, ;]", "");
        String lastAnswer = answer2.replaceAll("[, ;]", "");

        return "(" + firstAnswer + ")" + " " + lastAnswer;
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
//        System.out.println(Arrays.toString(arrayOfMultiples(6, 10)));
//        System.out.println(isEqual(1, 1));
}


}










