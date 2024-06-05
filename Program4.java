import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = nthDigit(n);
        System.out.println(ans);
        scanner.close();
    }

    static int nthDigit(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i <= n; i++) {
            stringBuffer.append(i);
            System.out.println(stringBuffer);
        }
        return Character.getNumericValue(stringBuffer.charAt(n));
    }
}
