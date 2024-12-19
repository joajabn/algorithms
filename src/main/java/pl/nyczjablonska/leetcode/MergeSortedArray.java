package pl.nyczjablonska.leetcode;

import java.util.Arrays;

//88. Merge Sorted Array
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, nums2.length);
        sort(nums1);
    }
    public static int[] sort(int[] array){
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        return array;
    }
}
/*
public void merge(int[] nums1, int m, int[] nums2, int n) {

        // while( m < m+n) {
        //     int k = 0;
        //     nums1[m] = nums2[k];
        //     m++;
        //     k++;
        // }

 int i = m - 1;  // Last element of original nums1
        int j = n - 1;  // Last element of nums2
        int k = m + n - 1;  // Last position of nums1

        // Merge nums1 and nums2 from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
*/
