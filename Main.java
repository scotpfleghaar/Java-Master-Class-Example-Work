public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 8; i++) {
            System.out.println(
                    "$10,000 @ " + i + "% interest = $" + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("=====================================");

        for (int i = 8; i >= 2; i--) {
            System.out.println(
                    "$10,000 @ " + i + "% interest = $" + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("=====================================");

        int tracker = 0;
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println("Prime Number: " + i);
                tracker++;
            }
            if (tracker == 3) {
                break;
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}

// $ javac Main.java && java Main