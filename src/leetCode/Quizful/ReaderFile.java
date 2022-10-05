package leetCode.Quizful;

import java.io.*;

public class ReaderFile {
    public static void main(String[] args) {
        File file = new File("C:\\file.txt");
        try {
//            FileInputStream input = new FileInputStream(file);
//            InputStream input = new FileInputStream(file);
//            Reader input = new FileReader(file);
            BufferedReader input = new BufferedReader(new FileReader(file));
            int i;
            while((i = input.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch (Exception ex) {
            System.out.println("Exception");
        }
    }

}
