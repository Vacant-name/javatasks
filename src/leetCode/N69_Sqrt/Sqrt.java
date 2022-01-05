package leetCode.N69_Sqrt;

public class Sqrt {
    int x = 2_147_483_647; // 2_147_483_647; // 1_073_741_823
    int pow = x;
    int count;
    int result = 0;
    int solve() {

        if (x == 1) {
            result = 1;
            return result;
        }
        for (int i = 0; i < 10; i++) {
            if (pow == 0) {
                break;
            } else {
                pow = pow / 10;
                count++;
            }
        }
        System.out.println("Numbers of signs = " + count);

        for (int i = 46340; i <= x/2; i++) {
            result = i;
            if ((result + 1) * (result + 1) - x > 0) {
                break;
            }
            if (result * result == x) {
                break;
            }
        }


        System.out.println("Sqrt = " + result);
        return result;
    }
}
