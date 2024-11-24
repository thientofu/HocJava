package baitap.Lab10Hocj;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Bảng chứ

public class IOJavaByte {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            // Đây là relative path
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
