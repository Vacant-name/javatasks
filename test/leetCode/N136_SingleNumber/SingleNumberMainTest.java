package leetCode.N136_SingleNumber;

import leetCode.N53_MaximumSubarray.MaximumSubarray;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberMainTest {
    static int[] arr1 = new int[]{-2, 1, 1};
    static int[] arr2 = new int[]{1, 0, 1};
    static int[] arr3 = new int[]{1, 1, 2, 2, 4};

    static SingleNumberMain nums1 = new SingleNumberMain(arr1);
    static SingleNumberMain nums2 = new SingleNumberMain(arr2);
    static SingleNumberMain nums3 = new SingleNumberMain(arr3);

    @Test
    public void solve1() {
        nums1.solve();
        assertSingle1(new int[] {-2});
    }

    @Test
    public void solve2() {
        nums2.solve();
        assertSingle2(new int[] {0});
    }

    @Test
    public void solve3() {
        nums3.solve();
        assertSingle3(new int[] {4});
    }

    public void assertSingle1(int[] expected) {
        assertArrayEquals(expected, nums1.solve());
    }
    public void assertSingle2(int[] expected) {
        assertArrayEquals(expected, nums2.solve());
    }
    public void assertSingle3(int[] expected) {
        assertArrayEquals(expected, nums3.solve());
    }
}