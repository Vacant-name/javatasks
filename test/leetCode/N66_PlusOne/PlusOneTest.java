package leetCode.N66_PlusOne;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PlusOneTest {

    static int[] arr1 = new int[]{1, 2, 3};
    static int[] arr2 = new int[]{8};
    static int[] arr3 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    static int[] arr4 = new int[]{9, 9};
    static int[] arr5 = new int[]{1, 9, 9};
    static int[] arr6 = new int[]{9};
    static int[] arr7 = new int[]{9, 8, 9};
    static int[] arr8 = new int[]{2,4,9,3,9};

    static PlusOne nums1 = new PlusOne(arr1);
    static PlusOne nums2 = new PlusOne(arr2);
    static PlusOne nums3 = new PlusOne(arr3);
    static PlusOne nums4 = new PlusOne(arr4);
    static PlusOne nums5 = new PlusOne(arr5);
    static PlusOne nums6 = new PlusOne(arr6);
    static PlusOne nums7 = new PlusOne(arr7);
    static PlusOne nums8 = new PlusOne(arr8);

    @Test
    public void solve1() {
        nums1.solve();
        assertMax1(new int[] {1, 2, 4});
    }
    @Test
    public void solve2() {
        nums2.solve();
        assertMax2(new int[] {9});
    }
    @Test
    public void solve3() {
        nums3.solve();
        assertMax3(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 1});
    }
    @Test
    public void solve4() {
        nums4.solve();
        assertMax4(new int[] {1, 0, 0});
    }
    @Test
    public void solve5() {
        nums5.solve();
        assertMax5(new int[] {2, 0, 0});
    }
    @Test
    public void solve6() {
        nums6.solve();
        assertMax6(new int[] {1, 0});
    }
    @Test
    public void solve7() {
        nums7.solve();
        assertMax7(new int[] {9, 9, 0});
    }
    @Test
    public void solve8() {
        nums8.solve();
        assertMax8(new int[] {2,4,9,4,0});
    }

    public void assertMax1(int[] expected) {
        assertArrayEquals(expected, nums1.solve());
    }
    public void assertMax2(int[] expected) {
        assertArrayEquals(expected, nums2.solve());
    }
    public void assertMax3(int[] expected) {
        assertArrayEquals(expected, nums3.solve());
    }
    public void assertMax4(int[] expected) {
        assertArrayEquals(expected, nums4.solve());
    }
    public void assertMax5(int[] expected) {
        assertArrayEquals(expected, nums5.solve());
    }
    public void assertMax6(int[] expected) {
        assertArrayEquals(expected, nums6.solve());
    }
    public void assertMax7(int[] expected) {
        assertArrayEquals(expected, nums7.solve());
    }
    public void assertMax8(int[] expected) {
        assertArrayEquals(expected, nums8.solve());
    }
}