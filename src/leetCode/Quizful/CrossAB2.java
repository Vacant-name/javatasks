package leetCode.Quizful;

class CrossAB2 {
    int x = 1;

    public void printX() {
        System.out.println(getX());
    }

    public int getX() {
        return x;
    }
}

class CrossBA2 extends CrossAB2 {
    int x = 2;

    public int getX() {
        return x + 1;
    }
}

class Test2 {
    public static void main(String[] args) {
        CrossAB2 a = new CrossBA2();
        System.out.println(a.x);
    }
}
