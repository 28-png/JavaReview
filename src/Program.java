import java.util.Arrays;

public class Program {
    public static int[] arrayOfMultiples(int num, int length) {
        int[] bucket = new int[length];
        for (int x = 0; x < length; x++)
            bucket[x] = num * (x+1);

            return bucket;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOfMultiples(6, 10)));
}


}










