package leetCode.N53_MaximumSubarray;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaximumSubarray {
    int[] nums;

    int allMinus = 0;

    public MaximumSubarray(int[] arr)  {
        nums = arr;
    }

    public int solve() {
        int max = nums[0];
        int sum = max;
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(sum, max);
        }
        return max;

//
//        if (nums.length == 1) {
//            System.out.println(max);
//            return nums[0];
//        }
//        if (nums.length == 2) {
//            sum = nums[0] + nums[1];
//
//            if (nums[0] > nums[1]) {
//                max = Math.max(nums[0], sum);
//            }
//            if (nums[1] > nums[0]) {
//                max = Math.max(nums[1], sum);
//            }
//        } else {
//            for (int i : nums) {
//                if (i > 0) {
//                    allMinus = 0;
//                    break;
//                } else allMinus++;
//            }
//            if (allMinus == 0) {
//
//                for (int i = 0; i < nums.length; i++) {
//                    for (int j = i; j < nums.length; j++) {
//                        sum = sum + nums[j];
//
//                        if (sum != max) {
//
//                            if (sum > max) {
//                                max = sum;
//                            }
//                        }
//                    }
//                    sum = 0;
//                }
//                System.out.println(max);
//                return max;
//            } else {
//                max = Arrays.stream(nums)
//                        .max()
//                        .getAsInt();
//                System.out.println(max);
//                return max;
//            }
//        }
//        System.out.println(max);
//        return max;
    }
}
