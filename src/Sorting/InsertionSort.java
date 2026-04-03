package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[]  unsortedArray = { 7, 2, 8, 5, 1, 4};

        printArray(unsortedArray);

        InsertionSort(unsortedArray);

        System.out.println();
        printArray(unsortedArray);
    }

    public static void InsertionSort(int[] unsortedArray)
    {    // 7 2 8 5 1 4
        // 1  2 4  5   7   8
        for (int i = 1; i < unsortedArray.length; i++)   // i = 5    elementi = 4
        {
            int temp = unsortedArray[i]; //1
            for (int j = i-1; j >=0; j--)    // j = 0  elementi = 2
            {
                if (temp < unsortedArray[j])  // 1 < 2
                {
                    unsortedArray[j+1] = unsortedArray[j];   // 1  --->  2
                    unsortedArray[j] = temp;              // 2 ---> 1
                }
                else
                {
                    break;
                }
            }

        }


    }



    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
