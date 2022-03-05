package leetCode.Quizful;

public class StaticFields {
        public static void main(String[] args) {
            System.out.println(AAA.i);
            System.out.println(BBB.i);
        }
    }

class AAA {
    static {
        i = 2;
    }
    static int i = 1;
}

class BBB {
    static int i = 1;
    static {
        i = 2;
    }
}

