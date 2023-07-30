package com.YMAN;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println(BinarySearchArray(arr, 40));
        System.out.println(linearSearch(arr, 60));
    }

    private static int BinarySearchArray(int[] array, int key)
    {
        int low = 0;
        int high = array.length - 1;

        while (low <= high)
        {
            int mid = (low + high) / 2;
            int middleNumber = array[mid];

            if (middleNumber == key)
            {
                return mid;
            }
            if(middleNumber < key)
            {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static int linearSearch(int[] array, int m)
    {
        for (int i=0; i<array.length; i++)
        {
            if (array[i] == m)
            {
                return i;
            }
        }

        return -1;
    }

}
