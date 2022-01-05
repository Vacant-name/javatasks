package leetCode.N14_LongestCommonPref;

import java.util.*;

public class LongestCommonPrefix {

    String[] strs = {""};
    Set<Character> set = new LinkedHashSet<>();
    StringBuilder sb = new StringBuilder();

    public void solve() {

            for (int i = 0; i < strs.length - 1; i++) {
            String temp;
            if (strs[i + 1].length() > (strs[i].length())) {
                temp = strs[i];
                strs[i] = strs[i + 1];
                strs[i + 1] = temp;
            }
        }

        String minWord = strs[strs.length - 1];
        System.out.println(minWord);

        for (int i = 0; i < minWord.length(); i++) { // letter holder

            for (int j = 0; j < strs.length ; j++) { // word holder
                set.add(strs[j].charAt(i));
            }

            if (set.size() == 0) {
                System.out.println("");
            }

            if (set.size() == 1) {
                sb.append(minWord.charAt(i));
                set.clear();
            }

            if (set.size() > 1) {
                break;
            }
        }
        System.out.println(sb.toString());
    }
}




//    StringBuilder stringBuilder = new StringBuilder("");
//
//    String min = Arrays.stream(str).min(Comparator.comparing(String::length)).get();
//
//    Set<Character> set = new HashSet<>();
//    public void solve() {
//
//        for (int i = 0; i < min.length(); i++) {
//
//            for (int j = 0; j < str.length; j++) {
//                set.add(str[j].charAt(i));
//            }
//            if (set.size() > 1) {
//                break;
//            }
//            String str3 = set.toString();
//            stringBuilder.append(str3);
//            set.clear();
//        }
//        System.out.println(stringBuilder);
//        System.out.println(stringBuilder.toString());




