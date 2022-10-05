package leetCode.Quizful;

import java.io.*;

public class CreatorReader {
    public static void main(String[] args) throws IOException {
        File path = new File("C://myFile.txt");
        String s = "hello";

        FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(s);
        bw.close();

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        System.out.println(br.readLine());
    }
}
