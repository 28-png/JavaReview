import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static int[] arrayOfMultiples(int num, int length) {
        int[] bucket = {};
        for (int counter = 0; counter < length; counter++)
            bucket = new int[] {num * (2 + counter)};
//                System.out.println(num * (2 + counter));
            return bucket;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOfMultiples(6, 10)));
}


}










