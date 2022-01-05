package leetCode.N13_Roman;

public class RomanNoMapMain  {
    public static void main(String[] args) {
        int i = 1974;
        String roman = RomanNoMap.toRoman(i);
        int arabic = RomanNoMap.toArabic(roman);
        System.out.println("Initial = " + i + ", roman = " + roman + ", arabic = " + arabic);
    }
}
