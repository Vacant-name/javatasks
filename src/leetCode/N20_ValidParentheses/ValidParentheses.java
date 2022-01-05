package leetCode.N20_ValidParentheses;

import java.util.*;

public class ValidParentheses {

    String s = "(])";
    char[] array = s.toCharArray();
    char temp;

    public boolean isValid() {
        if (s.length() == 0) {
            System.out.println("TRUE Length is 0");
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {

            if (array[i] == '(' || array[i] == '[' || array[i] == '{') {
                stack.push(array[i]);
            }

            if (array[i] == ')' || array[i] == ']' || array[i] == '}') {
                if (stack.empty()) {
                    System.out.println("FALSE Parentheses are back");
                    return false;
                } else {
                    temp = array[i];
                    if ((stack.peek() == '(' && temp == ')') || (stack.peek() == '[' && temp == ']') || (stack.peek() == '{' && temp == '}')) {
                        stack.pop();
                    } else {
                        System.out.println("FALSE Parentheses are back");
                        return false;
                    }
                }
            }
        }

        if (stack.empty()) {
            System.out.println("TRUE At the end stack is empty ");
            return true;
        } else {
            System.out.println("FALSE At the end stack is full ");
            return false;
        }
    }
}


























//        if (length == 0) {
//            return true;
//        }
//
//        Stack<Character> stack = new Stack<Character>();
//        for (int i = 0; i < length; i++) {
//            System.out.println("Start " + stack);
//            if (array[i] == '(' || array[i] == '{' || array[i] == '[') {
//                stack.push(array[i]);
//            }
//            if (array[i] == ')' || array[i] == '}' || array[i] == ']') {
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                char temp = stack.pop();
//                if ((temp == '(' && array[i] == ')') || (temp == '{' && array[i] == '}') || (temp == '[' && array[i] == ']')) {
//                    System.out.println("End " + stack);
//                    continue;
//                } else {
//                    return false;
//                }
//            }
//            System.out.println("End " + stack);
//        }
//        if (!stack.isEmpty()) {
//            return false;
//        } else return true;
//    }



//    String s = "(())";
//    char[] etal = new char[] {'(', '[', '{', ')', ']', '}', ')'};
//    char[] strChar = s.toCharArray();
//
//    int posStart;
//    int antiPos;
//    int posEnd;
//    int length = strChar.length;
//    int checkBack;
//    List<Character> divide = new ArrayList<>();
//
//    public boolean isValid() {
//        for (int exit = length; exit > 0; exit--) {
//
//            for (int i = 0; i < etal.length; i++) {
//                if (strChar[posStart] == etal[i]) {
//                    antiPos = i + 3;
//                    checkBack = i;
//                    break;
//                }
//            }
//            if (checkBack > 2) {
//                System.out.println("CheckBack " + exit);
//                return false;
//            }
//
//            if (strChar[length - 1] == etal[antiPos]) {
//                posEnd = (length - 1);
//            } else {
//                System.out.println("Check last sign " + exit);
//                return false;
//            }
//            System.out.println("posStart " + posStart);
//            System.out.println("strChar[posStart] " + strChar[posStart]);
//            System.out.println("posEnd " + posEnd);
//            System.out.println("strChar[posEnd] " + strChar[posEnd]);
//            System.out.println("antiPos " + antiPos);
//            posStart++;
//            length--;
//            System.out.println(Arrays.copyOfRange(strChar, posStart, posEnd));
//        }
//            return true;
//    }
//}
