public class Main {
    public static void main(String[] args) {
        int count = 1;
        while (count < 6) {
            System.out.println("Count value is : " + count);
            count++;
        }
        System.out.println("==============================");
        int num = 1;
        do {
            System.out.println("Count value is : " + num);
            num++;
        } while (num < 10);

        int testNum = 1;
        int counter = 0;
        int totalCount = 0;
        {
            while (testNum < 100) {
                if (isEven(testNum)) {
                    System.out.println("Even Number: " + testNum);
                    totalCount += testNum;
                    counter++;
                }

                if (counter == 5) {
                    System.out.println("Total Number: " + totalCount);
                    break;
                }
                testNum++;
            }
        }

    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}

// $ javac Main.java && java Main