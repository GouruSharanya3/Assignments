import java.util.Scanner;

public class FactorClassification {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.println("Factors and their classification:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (isPrime(i)) {
                    System.out.println(i + " is a prime factor.");
                } else {
                    System.out.println(i + " is not a prime factor.");
                }
            }
        }
        sc.close();
    }

}
