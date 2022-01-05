package leetCode.N27_RemoveElements;

import java.util.Arrays;

public class RemoveElements {
    int[] nums = new int[] {0,1,2,2,3,0,4,2};
    int val = 2;
    int k = 0;
    int max = nums.length - 1;
    public int solve() {

        for (int i = 0; i < max + 1; i++) {
            if (nums[i] == val) {
                nums[i] = nums[max];
                i--;
                max--;
            } else
                k++;
        }
        System.out.println(k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, k)));
        return k;
    }
}
