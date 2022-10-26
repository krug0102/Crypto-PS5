public class Main {
    public static void main(String[] args) {

        System.out.println("gcd of 31897 and 8977");
        System.out.println(euclideanAlgorithm(31897, 8977));

        System.out.println("gcd of 1712 and 1256");
        System.out.println(euclideanAlgorithm(1712, 1256));

        // To help with Problem 4.
        System.out.println(euclideanAlgorithm(99, 16));
        System.out.println(euclideanAlgorithm(500, 77));

    } // end main

    /**
     * Implementation of the euclidean algorithm.  Finds the gcd (greatest common divisor) or two integers.
     * @param a int
     * @param b int
     */
    public static int euclideanAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        }
        System.out.println(a + ", " + b);
        return euclideanAlgorithm(b, a % b);
    } // end euclideanAlgorithm

    /**
     * Implementation of the extended euclidean algorithm.  Finds the multiplicative inverse of
     * b mod a
     * @param a int
     * @param b int
     */
    public static int extendedEuclideanAlgorithm(int a, int b) {
        int counta;
        int countb;
        return 0;

    } // end extendedEuclideanAlgorithm

} // end Main