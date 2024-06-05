public class Program3{
    public static void main(String[] args) {
        int n = 10; // Replace 10 with any positive integer for which you want to find the factorial
        int factorial = calculateFactorial(n);
        int zeros = countTrailingZeros(factorial);
        System.out.println("Number of trailing zeroes in " + n + "! is: " + zeros);
    }
    
    static int calculateFactorial(int n) {
        if (n == 0)
            return 1;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    static int countTrailingZeros(int num) {
        int count = 0;
        while (num % 10 == 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
