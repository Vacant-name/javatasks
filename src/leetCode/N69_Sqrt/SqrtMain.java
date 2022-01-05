package leetCode.N69_Sqrt;

public class SqrtMain {
    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        double time1 = System.currentTimeMillis();
        sqrt.solve();
        System.out.println("Time " + ((System.currentTimeMillis() - time1) / 1000));
    }
}
