public class LargestFiveDigitNumber {
//largest five digit number
    public static int solve(final String digits) {
        int digits2 = digits.length();
        for(int i = 0; i <= digits2; i++) {
            if(digits.charAt(i) > digits.charAt(i)) {
                return digits.split(digits.charAt(i), 5);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
    solve("54321");
    }

}
