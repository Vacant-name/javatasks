package leetCode.N88_MergeSortedArray;

import java.util.Arrays;

public class MergeSortedArray {
    int m;
    int n;

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        this.m = m;
        this.n = n;
        int num2 = 0;
        for (int i = m; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                nums1[i] = nums2[num2];
                num2++;
            }
        }
        System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
