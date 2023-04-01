import java.math.BigInteger;

public class FactorialDigitSum {

    public static void main(String[] args) {
        BigInteger number = BigInteger.ONE;
        int numberOfDigits = 0, remainder = 0, sumOfDigits = 0;

        for (int i = 100; i > 0; i--) {
            number = number.multiply(BigInteger.valueOf(i));
        }

        System.out.println("100! = " + number);

        BigInteger temporaryNumber = number;

        while (temporaryNumber.compareTo(BigInteger.ZERO) != 0) {
            temporaryNumber = temporaryNumber.divide(BigInteger.valueOf(10));
            numberOfDigits++;
        }

        for (int i = 0; i < numberOfDigits; i++) {
            remainder = number.remainder(BigInteger.TEN).intValue();
            sumOfDigits += remainder;
            number = number.divide(BigInteger.TEN);
        }

        System.out.println("Sum of Digits: " + sumOfDigits);
    }
}
