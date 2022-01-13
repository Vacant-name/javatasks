package leetCode;

public class IntegerFalse {
    public static void main(String[] argv){
        Integer i = new Integer("10");
        if (i.toString().equals(i.toString())) {
            System.out.println("Равный");
        } else {
            System.out.println("Неравный");
        }
    }
}
