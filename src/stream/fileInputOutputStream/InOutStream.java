package stream.fileInputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InOutStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\nikit\\Documents\\Repositories\\hard_units\\stream\\src\\fileInputOutputStream\\file.txt");
        String data = "Hello";
        fileOutputStream.write(data.getBytes());
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\nikit\\Documents\\Repositories\\hard_units\\stream\\src\\fileInputOutputStream\\file.txt");
        int i;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char)i);
        }
    }
}
