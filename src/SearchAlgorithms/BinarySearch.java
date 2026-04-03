package SearchAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {2, 5, 7, 11 ,15, 18 ,21 ,43, 45, 50,51,55,56,57,60,64 };
        int target = 211;  //index = 6

        int[] index_count = BinarySearchAlgo(array, target);

        for (int element : index_count)
        {
            System.out.println(element);
        }
    }

    public static int[] BinarySearchAlgo(int[] array, int target)
    {
        // 2 5 7 11 15 18 21 43
        int start = 0;
        int end = array.length - 1;
        int mid;
        int count = 0;

        while(start <= end) {

            count += 1;
            mid = (start + end) / 2;

            if (target == array[mid]) return new int[] {mid, count};

            if (target > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return new int[]{-1, count};
    }



    public static int BinarySearchAlgoRecursive(int[] array, int target)
    {
        //recursion
        return -1;
    }
}
