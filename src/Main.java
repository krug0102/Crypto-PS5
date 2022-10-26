public class Main {
    public static void main(String[] args) {

        System.out.println(euclideanAlgorithm(120, 33));
        System.out.println(euclideanAlgorithm(22, 16));

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