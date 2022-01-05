import java.util.regex.Pattern;

public class Yandex {

    private final String line;

    public Yandex(String line) {
        this.line = line;
    }

    public void solveLine() {
        char[] massArr =  line.toCharArray();
        //System.out.println(massArr);
        int count = 0;
        boolean exit = true;

        if(!(Pattern.matches("[a-z]+",line))) {
            throw new Error("Pizdets");
        }
        while (exit) {

            int match = 0;
            for (int i = count; i <= massArr.length ; i++) {

                if (i == massArr.length) {
                    System.out.println(massArr[count] + " : " + match);
                    exit = false;
                    break;
                }
                if (massArr[count] == massArr[i]) {
                    match++;
                } else if (massArr[count] != massArr[i]) {
                    System.out.println(massArr[count] + " : " + match);
                    count = i;
                    break;
                }
            }
        }
    }
}



