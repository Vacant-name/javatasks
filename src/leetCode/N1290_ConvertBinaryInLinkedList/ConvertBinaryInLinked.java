package leetCode.N1290_ConvertBinaryInLinkedList;

public class ConvertBinaryInLinked {
    StringBuilder sb = new StringBuilder();
    String s;
    double sum = 0D;
    public int getDecimalValue(ListNode head) {
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        s = sb.toString();
        System.out.println(s);
        int j = 0;
        int tempConvert;
        for (int i = s.length() - 1; i != -1; i--) {
            tempConvert = Integer.parseInt(s.substring(j, j + 1));
            sum += (tempConvert * Math.pow(2,i));
            j++;
        }
        System.out.println((int)sum);
        return (int)sum;
    }
}
