package leetCode.Quizful;

public class EqualsOrSimple {

    String s = null;

    EqualsOrSimple(String str) {
        this.s = str;
    }
}

class MyTest {
    public static void main(String[] args) {
        EqualsOrSimple v1 = new EqualsOrSimple("abc");
        EqualsOrSimple v2 = new EqualsOrSimple("abc");

        System.out.println((v1 == v2) + " " + v1.equals(v2));
        System.out.println((v1.s == v2.s) + " " + v1.s.equals(v2.s));

    }
}

