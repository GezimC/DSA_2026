package JavaRecap;

public class Basics_2 {

    public static void main(String[] args) {

        // Example tests

        // int[] array = {1, 2, 3, 4, 5};
        //
        // System.out.println("Before reverse:");
        // printArray(array);
        // System.out.println();
        //
        // reverseArray(array);
        //
        // System.out.println("After reverse:");
        // printArray(array);

        // System.out.println(isPalindrome("Level"));

        System.out.println(isSortedAsc(new int[]{1, 2, 5, 4, 3}));
    }


    // ------------------------------------------------------------
    // 10. Calculate the average value of elements in an array
    // ------------------------------------------------------------
    public static int findAverage(int[] array) {

        int sum = 0;

        for (int element : array) {
            sum += element;
        }

        return sum / array.length;
    }


    // ------------------------------------------------------------
    // 11. Count how many even numbers exist in an array
    // ------------------------------------------------------------
    public static int countEvenNumbers(int[] array) {

        int countEven = 0;

        for (int element : array) {

            if (element % 2 == 0)
                countEven++;
        }

        return countEven;
    }


    // ------------------------------------------------------------
    // 12. Reverse the elements of an array
    // ------------------------------------------------------------
    public static void reverseArray(int[] array) {

        int i = 0;
        int j = array.length - 1;

        int temp;

        while (i < j) {

            temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            i++;
            j--;
        }
    }


    // ------------------------------------------------------------
    // 13. Find index of element in array
    // Return -1 if element is not found
    // ------------------------------------------------------------
    public static int findIndex(int[] array, int target) {

        int index = -1;

        for (int i = 0; i < array.length; i++) {

            if (target == array[i]) {
                index = i;
                break;
            }
        }

        return index;
    }


    // ------------------------------------------------------------
    // 14. Check if a string is a palindrome
    // ------------------------------------------------------------
    public static boolean isPalindrome(String word) {

        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            reversedWord += word.charAt(i);
        }

        return word.equalsIgnoreCase(reversedWord);
    }


    // ------------------------------------------------------------
    // 15. Check if an array is sorted in ascending order
    // ------------------------------------------------------------
    public static boolean isSortedAsc(int[] array) {

        boolean isAsc = true;
        int previous = array[0];

        for (int i = 1; i < array.length; i++) {

            if (previous > array[i]) {
                isAsc = false;
            }

            previous = array[i];
        }

        return isAsc;
    }


    // ------------------------------------------------------------
    // HOMEWORK EXERCISES (Not solved in class)
    // Students should implement these methods
    // ------------------------------------------------------------

    // 16. Given an integer array and a number,
    // create a method that counts how many times the number appears in the array.
    //
    // Example:
    // array = [1,2,3,2,2,5]
    // target = 2
    // output = 3


    // ------------------------------------------------------------
    // MATRIX EXERCISES
    // ------------------------------------------------------------

    // 17. Create a method that calculates the sum of each row in a matrix.


    // 18. Create a method that calculates the sum of each column in a matrix.


    // 19. Create a method that searches for a number in a matrix
    // and returns its position (row and column).


    // ------------------------------------------------------------
    // 20. Diagonal Elements of a Matrix
    // ------------------------------------------------------------

    // PART 1
    // Create a method that prints the elements of the MAIN DIAGONAL of a square matrix.
    //
    // Example matrix:
    //
    // 1  2  3
    // 4  5  6
    // 7  8  9
    //
    // Main diagonal elements are:
    // 1 5 9


    // PART 2
    // Create a method that prints the elements of the SECONDARY DIAGONAL of a square matrix.
    //
    // Example matrix:
    //
    // 1  2  3
    // 4  5  6
    // 7  8  9
    //
    // Secondary diagonal elements are:
    // 3 5 7


    // 21. Create a method that checks whether a matrix is symmetric.
    //
    // A matrix is symmetric if:
    // matrix[i][j] == matrix[j][i]


    // ------------------------------------------------------------
    // Helper methods
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