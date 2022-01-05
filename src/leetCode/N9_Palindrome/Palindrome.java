package leetCode.N9_Palindrome;

public class Palindrome {

    int number = 1001;
    char[] massArr = ("" + number).toCharArray();
    double firstMedian = massArr.length / 2.0;
    int secondMedian = massArr.length % 2;

    public void solve() {
        if (number < 0) {
            System.out.println(false);
        } else if (massArr.length == 1) {
            System.out.println(true);
        } else if (firstMedian <= 1.49) {
            System.out.println(massArr[0] == massArr[1]);
        } else if (secondMedian > 0) {
            int max = massArr.length - 1;
            for (int i = 0; i < firstMedian + 1; i++) {
                if (massArr[i] == massArr[max]) {
                    max = max - 1;
                } else {
                    System.out.println(false);
                }
            }
            System.out.println(true);
        } else if (secondMedian == 0) {
            int max = massArr.length - 1;
            for (int i = 0; i <= firstMedian; i++) {
                if (massArr[i] == massArr[max]) {
                    max = max - 1;
                } else {
                    System.out.println(false);
                }
            }
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}