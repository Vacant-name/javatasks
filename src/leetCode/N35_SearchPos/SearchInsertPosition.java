package leetCode.N35_SearchPos;

import java.util.Arrays;

public class SearchInsertPosition {
    int[] nums = new int[]{1,3,5,6};
    int target = 2;
    int pos;
    int expectedPos;

    public int solve() {
        pos = Arrays.binarySearch(nums, target);
        if (pos >= 0) {
            System.out.println(pos);
            return pos;
        } else {
            expectedPos = -pos - 1;
            System.out.println(expectedPos);
            return expectedPos;
        }

    }
}
