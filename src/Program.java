import java.util.Arrays;

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


    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOfMultiples(6, 10)));
        System.out.println(isEqual(1, 1));
}


}










