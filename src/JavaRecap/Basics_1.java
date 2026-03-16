package JavaRecap;

public class Basics_1 {

    public static void main(String[] args) {

        // Example method calls for testing

        // isEven(8);
        // printLargestNumber(5, 4, 8);
        // printMultiplicationTable(8);

        // int result = calculateSum(4);
        // System.out.printf("The sum till number %d is %d%n", 4, result);

        // System.out.println(countDigits(12345));
        // System.out.println(reverseInteger(1234));
        // System.out.println(isPrime(15));

        int[] array = {10, 12, 5, 7, 17};

        // System.out.println(maxOfArray(array));

        printArray(array);
    }

    // ------------------------------------------------------------
    // 1. Check if a number is even or odd
    // ------------------------------------------------------------
    public static void isEven(int number) {

        if (number % 2 == 0) {
            System.out.printf("The number %d is even!%n", number);
        } else {
            System.out.printf("The number %d is odd!%n", number);
        }
    }

    // Optimized version (returns boolean instead of printing)

    public static boolean isEvenOptimized(int number) {
        return number % 2 == 0;
    }

    // ------------------------------------------------------------
    // 2. Find the largest of three numbers
    // ------------------------------------------------------------
    public static void printLargestNumber(int first, int second, int third) {

        int max = first;

        if (max < second)
            max = second;

        if (max < third)
            max = third;

        System.out.printf(
                "Largest of numbers %d, %d, %d is %d%n",
                first, second, third, max
        );
    }

    // ------------------------------------------------------------
    // 3. Print multiplication table (1 to 10)
    // ------------------------------------------------------------
    public static void printMultiplicationTable(int number) {

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }
    }

    // ------------------------------------------------------------
    // 4. Calculate sum from 1 to N
    // ------------------------------------------------------------
    public static int calculateSum(int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        return sum;
    }

    // ------------------------------------------------------------
    // 5. Count digits in an integer
    // ------------------------------------------------------------
    public static int countDigits(int number) {

        int count = 1;

        while (number / 10 != 0) {
            count++;
            number = number / 10;
        }

        return count;
    }

    // ------------------------------------------------------------
    // 6. Reverse an integer number
    // ------------------------------------------------------------
    public static int reverseInteger(int number) {

        int digits = countDigits(number);
        int remaining;
        int reversed = 0;

        for (int i = digits - 1; i >= 0; i--) {

            remaining = number % 10;

            reversed += remaining * (int) Math.pow(10, i);

            number = number / 10;
        }

        return reversed;
    }

    // ------------------------------------------------------------
    // 7. Factorial of a number
    // ------------------------------------------------------------
    public static int factorial(int num) {

        int result = 1;

        while (num > 0) {
            result *= num;
            num--;
        }

        return result;
    }

    // ------------------------------------------------------------
    // 8. Check if number is prime
    // ------------------------------------------------------------
    public static boolean isPrime(int n) {

        if (n == 2)
            return true;

        for (int i = 2; i < n; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    // ------------------------------------------------------------
    // 9. Find the largest element in an array
    // ------------------------------------------------------------
    public static int maxOfArray(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    // ------------------------------------------------------------
    // Helper Methods
    // ------------------------------------------------------------

    // Print array elements
    public static void printArray(int[] array) {

        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    // Print matrix elements
    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.println(matrix[i][j]);
            }
        }
    }
}