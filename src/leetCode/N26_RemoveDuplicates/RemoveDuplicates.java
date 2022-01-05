package leetCode.N26_RemoveDuplicates;

import java.util.*;

public class RemoveDuplicates {
    int[] nums = new int[] {0,0,1,1,1,2,1,2,3,3,4};
    int k = 0;
    int max = nums.length;
    public int solve() {

        int shiftDistance = 0;
        int length = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                shiftDistance++;
            } else {
                nums[i - shiftDistance] = nums[i];
                length++;
            }
        }

//        Set<Integer> set = new LinkedHashSet<>();
//        for (int i = 0; i != nums.length; i++) {
//            set.add(nums[i]);
//        }
//        System.out.println("Set " + set);
//
//
//
//        Iterator<Integer> iterator = set.iterator();
//        int i = 0;
//        while (iterator.hasNext()) {
//            nums[i] = iterator.next();
//            i++;
//        }



//        List<Integer> list = new ArrayList<>(set);
//
//        for (int i = 0; i < set.size(); i++) {
//            nums[i] = list.get(i);
//        }
//
//        System.out.println("List" + list);
        k = length + 1;


        System.out.println("New nums " + Arrays.toString(nums));


        System.out.println(k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, k)));
        return k;
    }
}
