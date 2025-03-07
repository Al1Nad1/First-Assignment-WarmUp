public class Exercises {

    // Function for checking the prime number 
    public boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function for finding the index of fibo 
    public long fibonacciIndex(long n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        long a = 0, b = 1, index = 1;
        while (b < n) {
            long temp = b;
            b = a + b;
            a = temp;
            
        }
        return (b == n) ? index : -1;
    }

    // Function for triangle 
    public char[][] generateTriangle(int n) {
        char[][] triangle = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == n - 1) {
                    triangle[i][j] = '*';
                } else {
                    triangle[i][j] = ' ';
                }
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        Exercises ex = new Exercises();

        // Test isPrime function
        System.out.println("Is 11 prime? " + ex.isPrime(11)); // true
        System.out.println("Is 12 prime? " + ex.isPrime(12)); // false

        // Test fibonacciIndex function
        System.out.println("Fibonacci index of 5: " + ex.fibonacciIndex(5)); // 5
        System.out.println("Fibonacci index of 7: " + ex.fibonacciIndex(7)); // -1

        // Test generateTriangle function
        char[][] triangle = ex.generateTriangle(5);
        for (char[] row : triangle) {
            for (char c : row) {
                System.out.print(c == '\0' ? ' ' : c); // 2D triangle exactly like the one AMIN used 
            }
            System.out.println();
        }
    }
}
