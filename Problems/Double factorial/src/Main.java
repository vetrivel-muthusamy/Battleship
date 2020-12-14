import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        // type your java code here
        BigInteger bigInteger = BigInteger.ONE;

        for (int i = n; i > 0; i -= 2) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }

        return bigInteger;
    }
}