public class LargestFiveDigitNumber {

    public static int solve(final String digits) {
        int digits2 = digits.length();
        for(int i = 0; i <= digits2; i++) {
//            System.out.println(i);
            if(digits.charAt(i) > digits.charAt(i)) {
                return digits.split(digits, 5);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
    solve("54321");
    }

}
