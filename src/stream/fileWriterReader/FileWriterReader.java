package stream.fileWriterReader;

import java.io.*;

public class FileWriterReader {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\nikit\\Documents\\Repositories\\hard_units\\stream\\src\\fileWriterReader\\file.txt";
        String data = "oneFile";

        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        System.out.println(bufferedReader.read());
    }
}
