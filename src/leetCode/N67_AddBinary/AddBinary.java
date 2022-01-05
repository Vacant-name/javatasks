package leetCode.N67_AddBinary;

import java.util.Arrays;
import java.util.Objects;

public class AddBinary {
    String a;
    String b;

    public AddBinary(String a, String b) {
        this.a = a;
        this.b = b;
    }

    String solve() {
        StringBuilder sb1 = new StringBuilder(a);
        StringBuilder sb2 = new StringBuilder(b);
        System.out.println("Before reverse " + sb1);
        System.out.println("Before reverse " + sb2);

        String aA = sb1.reverse().toString();
        String bB = sb2.reverse().toString();
        System.out.println("After reverse " + aA);
        System.out.println("After reverse " + bB);

        String[] aStrArr = aA.split("");
        String[] bStrArr = bB.split("");

        int max = Math.max(aStrArr.length, bStrArr.length);

        int[] aIntArr = new int[max];
        int[] bIntArr = new int[max];

        for (int i = 0; i < aStrArr.length; i++) {
            if (Objects.equals(aStrArr[i], "1")) {
                aIntArr[i] = 1;
            } else {
                aIntArr[i] = 0;
            }
        }
        for (int i = 0; i < bStrArr.length; i++) {
            if (Objects.equals(bStrArr[i], "1")) {
                bIntArr[i] = 1;
            } else {
                bIntArr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(aIntArr));
        System.out.println(Arrays.toString(bIntArr));

        int[] sumArr = new int[max];
//        0 + 0 = 0,
//        0 + 1 = 1,
//        1 + 0 = 1,
//        1 + 1 = 10,
//        1 + 1 + 1 = 11
        int temp = 0;
        for (int i = 0; i < max; i++) {
            if (aIntArr[i] == 0 & bIntArr[i] == 0) {
                if (temp == 0) {
                    sumArr[i] = 0;
                } else {
                    sumArr[i] = 1;
                    temp = 0;
                }
            }
            if (aIntArr[i] == 1 & bIntArr[i] == 0) {
                if (temp == 0) {
                    sumArr[i] = 1;
                } else {
                    sumArr[i] = 0;
                }
            }
            if (aIntArr[i] == 0 & bIntArr[i] == 1) {
                if (temp == 0) {
                    sumArr[i] = 1;
                } else {
                    sumArr[i] = 0;
                }
            }
            if (aIntArr[i] == 1 & bIntArr[i] == 1) {
                if (temp == 0) {
                    sumArr[i] = 0;
                    temp = 1;
                } else {
                    sumArr[i] = 1;
                    temp = 1;
                }
            }
        }

        int min = Math.min(aStrArr.length, bStrArr.length);
        int index = -1;

        if (temp == 1) {

            for (int i = min + 1; i < max; i++) {
                if (sumArr[i] >= sumArr.length & sumArr[i] == 0) {
                    index = sumArr[i];
                    temp = 0;
                }
            }
            if (index != -1) {
                sumArr[index] = temp;
            } else {
                sumArr = Arrays.copyOf(sumArr, max + 1);
                sumArr[max] = temp;
            }
        }

        StringBuilder sbSum = new StringBuilder(Arrays.toString(sumArr));
        String sum = sbSum.reverse().toString().
                replace("[","").
                replace(",", "").
                replace("]", "").
                replace(" ", "");
        System.out.println("Sum " + sum);
        return sum;
    }
}
