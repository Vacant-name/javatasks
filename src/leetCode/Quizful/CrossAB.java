package leetCode.Quizful;

class CrossAB {
    int x = 1;

    public void printX() {
        System.out.println(getX());
    }

    public int getX() {
        return x;
    }
}
class CrossBA extends CrossAB {
    int x = 2;

    public int getX() {
        return x + 1;
    }
}

 class Test {
    public static void main(String[] args) {
        CrossAB classAB = new CrossBA();
        classAB.printX();
    }
}

