package leetCode.N13_Roman;

import java.util.*;

public class RomanMap {
//    int[] goodArabic = {1, 5, 10, 50, 100, 500, 1000};
//    String[] goodRoman = {"I", "V", "X", "L", "C", "D", "M"};
//
//    //int[] badArabic = {4, 9, 40, 90, 400, 900};
//    int[] badArabic = {-2, -2, -20, -20, -200, -200};
//    String[] badRoman = {"IV", "IX", "XL", "XC", "CD",  "CM"};

    public void solve(String s) throws Exception {

        Map<String, Integer> mapGood = new LinkedHashMap<String, Integer>() {{put("I", 1); put("V", 5); put("X", 10); put("L", 50); put("C", 100); put("D", 500); put("M", 1000);}};

        int val1 = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = i + 1;
            if (mapGood.containsKey(s.substring(i, j))) {
                val1 += mapGood.get(s.substring(i, j));
            }
        }

        Map<String, Integer> mapBad = new LinkedHashMap<String,Integer>(){{put("IV",-2); put("IX",-2); put("XL",-20); put("XC",-20); put("CD",-200); put("CM",-200);}};

        int val2 = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int j = i + 2;
            if (mapBad.containsKey(s.substring(i, j))) {
                val2 +=  mapBad.get(s.substring(i, j));
            }
        }
        System.out.println(val1 + " " + val2);


//
//
//        else {
//
//            String[] entryMass = s.split("");
//
//            for (int i = 0; i < 14; i++) {
//                mapEtalon.put(roman[i], arabic[i]);
//            }
//
//            int[] forSum = new int[entryMass.length];
//            for (int i = 0; i < entryMass.length; i++) {
//
//                if (mapEtalon.containsKey(entryMass[i])) {
//                    forSum[i] = mapEtalon.get(entryMass[i]);
//                } else throw new Exception("Error of the symbol");
//            }
//            int total = IntStream.of(forSum).sum();
//            System.out.println(total);
//        }
    }
}
