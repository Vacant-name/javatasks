package fromCompanies;

import java.util.regex.Pattern;

public class YandexDima {
    public static void main(String[] args) {

        System.out.println(CalculateUpWords("AAAdBAAACCCCFFDHHHSSSSMMMMKKK"));
    }

    public static String CalculateUpWords(String input) {

        int count = 0;

        StringBuilder stringBuilder = new StringBuilder();

        if (!Pattern.matches("[A-Z]+", input)) {
            throw new RuntimeException("Exception");
        }

        for (int i = 0; i <input.length(); i++) {

            for (int j = i;;j++) {

                if(count==input.length()){
                    if((count-i)>1){
                        stringBuilder.append(input.charAt(i));
                        stringBuilder.append(count-i);}
                    break; }

                if (input.charAt(i)!=input.charAt(j)){
                    if((count-i)>1){
                        stringBuilder.append(input.charAt(i));
                        stringBuilder.append(count-i);}
                    break;
                } else {
                    count++;
                }
            }
            i=count-1;
        }
        return stringBuilder.toString();
    }
}
