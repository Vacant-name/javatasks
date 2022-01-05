package leetCode.N1_TwoSum;

import java.util.*;

public class TwoSum {
    Integer[] nums = {128,128,3,5};
    Integer target = 256;

    public void solve() {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            list.add(nums[i]);
//        }
        Integer[] newArr = nums;

        Integer num1 = 0;
        Integer num2 = 0;
        Integer sum = 0;

        int[] out = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!sum.equals(target)) {
                for (int j = i + 1; j < nums.length; j++) {
                    num1 = newArr[i];
                    num2 = newArr[j];
                    sum = num1 + num2;
                    if (sum.equals(target)) {
                        out[0] = i;
                        out[1] = j;
//                        System.out.println(Objects.equals(num1, num2));
//                        System.out.println(num1.equals(num2));
//                        System.out.println(num1 == num2);
                        System.out.println(Arrays.toString(out));
                        break;
                    }
                }
            } else break;
        }
    }
}
