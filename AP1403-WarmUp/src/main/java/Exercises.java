public class Exercises {

    // Function for checking the prime number 
    public boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public long fibonacciIndex(long n) {
        if (n < 0) return -1;

        long a = 0, b = 1;
        long index = 1;

        if (n == 0) return 0;
        if (n == 1) return 1;

        while (b < n) {
            long temp = b;
            b = a + b;
            a = temp;
            index++;
        }
        if (b == n) {
            return index;
        } else {
            return -1;
        }
    }


    public char[][] generateTriangle(int n) {
        if (n == 0) return new char[0][0];

        char[][] triangle = new char[n][];

        for (int i = 0; i < n; i++) {
            triangle[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                if (i == n - 1 || j == 0 || j == i) {
                    triangle[i][j] = '*';
                } else {
                    triangle[i][j] = ' ';
                }
            }
        }

        return triangle;
    }
}