package leetCode.N136_SingleNumber;

import java.util.Arrays;

public class SingleNumberMain {
    int[] nums;

    public SingleNumberMain(int[] arr1) {
        nums = arr1;
    }

    int[] solve() {
        int[] out = new int[1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            out[0] = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (out[0] == nums[j]) {
                    out[0] = 0;
                    i = j;
                    break;
                } else {
                    System.out.println(Arrays.toString(out));
                    return out;
                }
            }
        }
        System.out.println(Arrays.toString(out));
        return out;
    }
    public static void main(String[] args) {
    }
}
