package leetCode.N66_PlusOne;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PlusOne {
    int[] digits;
    int[] dFinal;
    int index = -1;

    // StringBuilder stringBuilder = new StringBuilder();

    public PlusOne(int[] arr) {
        digits = arr;
    }


    int[] solve() {

        if (digits[digits.length - 1] < 9) {
            dFinal = Arrays.copyOf(digits, digits.length);
            dFinal[digits.length - 1] = digits[digits.length - 1] + 1;
        } else {
            for (int j = digits.length - 1; j != -1 ; j--) { // 989 + 1 = 990,9889 + 1 = 9890, 99 + 1 = 100,
                if (digits[j] < 9) {
                    index = j;
                    break;
                }
            }
            if (index != -1) {
                if (digits[index + 1] == 9) { // 199
                    dFinal = Arrays.copyOf(digits, digits.length);
                    Arrays.fill(dFinal, index, dFinal.length, 0);
                    dFinal[index] = digits[index] + 1;
                }
            } else {
                dFinal = new int[digits.length + 1];
                Arrays.fill(dFinal, 1, dFinal.length, 0);
                dFinal[0] = 1;
            }
        }


//            if (digits[i - 1] < 9) {
//                dFinal = new int[digits.length];
//                dFinal[i] = digits[i] + 1;
//
//                if (digits[i - 1] == 9) {
//                    temp = 1;
//                    dFinal[i] = 0;
//                }
//                dFinal[i - 1] = digits[i - 1] + temp;
//
//            }



        System.out.println(Arrays.toString(dFinal));
        return dFinal;
    }
}
/*
        for (int i = 0; i < digits.length; i++) {
            stringBuilder.append(digits[i]);
        }
        Integer digitsInt = Integer.parseInt(String.valueOf(stringBuilder)) + 1;
        String digitsStr = String.valueOf(digitsInt);
        System.out.println(digitsStr);

        int[] digitsFinal = new int[digitsStr.length()];
        for (int i = digitsStr.length() - 1; i >= 0; i--) {
            digitsFinal[i] = digitsInt % 10;
            digitsInt /= 10;
        }

        System.out.println(Arrays.toString(digitsFinal));
 */