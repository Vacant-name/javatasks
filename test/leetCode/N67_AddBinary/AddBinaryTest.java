package leetCode.N67_AddBinary;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {

    static AddBinary nums1 = new AddBinary("1", "1");
    static AddBinary nums2 = new AddBinary("0", "1");
    static AddBinary nums3 = new AddBinary("11", "1");
    static AddBinary nums4 = new AddBinary("1010", "10");
    static AddBinary nums5 = new AddBinary("1", "111");
    static AddBinary nums6 = new AddBinary("1111", "1111");


    @Test
    public void solve1() {
        nums1.solve();
        assertMax1("10");
    }
    @Test
    public void solve2() {
        nums2.solve();
        assertMax2("1");
    }
    @Test
    public void solve3() {
        nums3.solve();
        assertMax3("100");
    }
    @Test
    public void solve4() {
        nums4.solve();
        assertMax4("1100");
    }
    @Test
    public void solve5() {
        nums5.solve();
        assertMax5("1000");
    }
    @Test
    public void solve6() {
        nums6.solve();
        assertMax6("11110");
    }

    public void assertMax1(String expected) {
        assertEquals(expected, nums1.solve());
    }
    public void assertMax2(String expected) {
        assertEquals(expected, nums2.solve());
    }
    public void assertMax3(String expected) {
        assertEquals(expected, nums3.solve());
    }
    public void assertMax4(String expected) {
        assertEquals(expected, nums4.solve());
    }
    public void assertMax5(String expected) {
        assertEquals(expected, nums5.solve());
    }
    public void assertMax6(String expected) {
        assertEquals(expected, nums6.solve());
    }

}