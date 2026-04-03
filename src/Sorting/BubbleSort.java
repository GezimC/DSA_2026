package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int [] unsortedArr = {9, 2, 12, 4, 5, 6, 7};

//        for (int elem: unsortedArr)
//        {
//            System.out.print(elem + " ");
//        }

        BubbleSortAlgo(unsortedArr);
        System.out.println();
//
//        for (int elem: unsortedArr)
//        {
//            System.out.print(elem + " ");
//        }


    }

    public static void BubbleSortAlgo(int[] unsortedArr)
    {
        // 12 5 7 21 18 23 8 25
        int arrayLength = unsortedArr.length;

       // int dynamicLength = arrayLength;

        for (int j =0; j <  arrayLength - 1; j++ ) {
            boolean flag = false;
            for (int i = 0; i < arrayLength - 1 - j; i++) {
                if (unsortedArr[i] > unsortedArr[i + 1]) {
                    int temp = unsortedArr[i];
                    unsortedArr[i] = unsortedArr[i + 1];
                    unsortedArr[i + 1] = temp;

                    flag = true;
                }
            }
            if (!flag) break;
            for (int elem: unsortedArr)
            {
                System.out.print(elem + " ");
            }
            System.out.println();

        }
    }

}
