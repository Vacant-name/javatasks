package leetCode.N58_LengthLastWord;

import java.util.LinkedList;
import java.util.List;

public class LengthOfLastWord {
    String s = " hello world ";
    int length;
    StringBuilder lastWord = new StringBuilder();
    boolean mark = true;
    public int solve() {
        if (s.length() == 1) {
            return 1;
        }
        while (mark) {
            for (int i = s.length(); i > 0; i--) {
                if (s.charAt(i - 1) != ' ') {
                    lastWord.append(s.charAt(i - 1));
                    length = lastWord.length();
                    System.out.println(lastWord);
                }
                if (s.charAt(i - 1) == ' ' && lastWord.length() != 0) {
                    System.out.println(lastWord);
                    break;
                }
            }
            mark = false;
        }
        System.out.println(length);
        return length;
    }
}
