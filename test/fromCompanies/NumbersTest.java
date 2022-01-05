package fromCompanies;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {
    Numbers numbers = new Numbers(new int[]{2, -1, 4, 2, 3});

    @Test (expected = Exception.class)
    public void solveMassArr() throws Exception {
        numbers.solveArrayList();
    }
}