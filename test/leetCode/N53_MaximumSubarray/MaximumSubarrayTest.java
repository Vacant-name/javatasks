package leetCode.N53_MaximumSubarray;

import leetCode.N53_MaximumSubarray.MaximumSubarray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {

    static int[] arr1 = new int[]{-2, 1};
    static int[] arr2 = new int[]{2, -1};
    static int[] arr3 = new int[]{-2, -1};
    static int[] arr4 = new int[]{-1, -2};
    static int[] arr5 = new int[]{1, 2};
    static int[] arr6 = new int[]{2, 1};
    static int[] arr7 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
    static int[] arr8 = new int[]{-2,-3,-1};
    static int[] arr9 = new int[]{-1,-1,-2, -2};



    static MaximumSubarray nums1 = new MaximumSubarray(arr1);
    static MaximumSubarray nums2 = new MaximumSubarray(arr2);
    static MaximumSubarray nums3 = new MaximumSubarray(arr3);
    static MaximumSubarray nums4 = new MaximumSubarray(arr4);
    static MaximumSubarray nums5 = new MaximumSubarray(arr5);
    static MaximumSubarray nums6 = new MaximumSubarray(arr6);
    static MaximumSubarray nums7 = new MaximumSubarray(arr7);
    static MaximumSubarray nums8 = new MaximumSubarray(arr8);
    static MaximumSubarray nums9 = new MaximumSubarray(arr9);


    @Test
    public void solve1() {
        nums1.solve();
        assertMax1(1);
    }
    @Test
    public void solve2() {
        nums2.solve();
        assertMax2(2);
    }
    @Test
    public void solve3() {
        nums3.solve();
        assertMax3(-1);
    }
    @Test
    public void solve4() {
        nums4.solve();
        assertMax4(-1);
    }
    @Test
    public void solve5() {
        nums5.solve();
        assertMax5(3);
    }
    @Test
    public void solve6() {
        nums6.solve();
        assertMax6(3);
    }
    @Test
    public void solve7() {
        nums7.solve();
        assertMax7(6);
    }
    @Test
    public void solve8() {
        nums8.solve();
        assertMax8(-1);
    }
    @Test
    public void solve9() {
        nums9.solve();
        assertMax9(-1);
    }

    public void assertMax1(int expected) {
        assertEquals(expected, nums1.solve());
    }
    public void assertMax2(int expected) {
        assertEquals(expected, nums2.solve());
    }
    public void assertMax3(int expected) {
        assertEquals(expected, nums3.solve());
    }
    public void assertMax4(int expected) {
        assertEquals(expected, nums4.solve());
    }
    public void assertMax5(int expected) {
        assertEquals(expected, nums5.solve());
    }
    public void assertMax6(int expected) {
        assertEquals(expected, nums6.solve());
    }
    public void assertMax7(int expected) {
        assertEquals(expected, nums7.solve());
    }
    public void assertMax8(int expected) {
        assertEquals(expected, nums8.solve());
    }
    public void assertMax9(int expected) {
        assertEquals(expected, nums9.solve());
    }
}