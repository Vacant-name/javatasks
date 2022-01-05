package leetCode.N28_HaystackNeedle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HaystackNeedle {
    String haystack = "Hello";
    String needle = "ll";

    public int solve() {
        Pattern p = Pattern.compile(needle);
        Matcher m = p.matcher(haystack);
        if (haystack.length() != 0 | needle.length() != 0) {
            if (m.find()) {
                for (int i = 0; i < haystack.length(); i++) {
                    int j = i + needle.length();
                    if (haystack.substring(i, j).equals(needle)) {
                        return i;
                    }
                }
            } return -1;
        } return 0;
    }
}
