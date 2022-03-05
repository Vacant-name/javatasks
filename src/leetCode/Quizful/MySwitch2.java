package leetCode.Quizful;

public class MySwitch2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4 ; ) {
            switch(new Integer(i++)) {
                case 1:
                    System.out.print("one ");
                    break;
                case 3:
                    System.out.print("three ");
                case 4:
                    System.out.print("four ");
                default:
                    System.out.print("def ");
            }
        }
    }
}
