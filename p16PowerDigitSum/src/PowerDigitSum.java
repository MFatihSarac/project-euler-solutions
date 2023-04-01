import java.math.BigInteger;

public class PowerDigitSum {

    public static void main(String[] args) {
        int sumOfDigits = 0;

        BigInteger number = BigInteger.valueOf(2).pow(1000);
        String numberString = number.toString(10);

        for (int i = 0; i < numberString.length(); i++) {
            sumOfDigits += Character.getNumericValue(numberString.charAt(i));
        }

        System.out.println(sumOfDigits);
    }
}
