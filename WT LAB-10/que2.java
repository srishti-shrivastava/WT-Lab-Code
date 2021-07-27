import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class que2 {
    public static void copyContent(File a, File b)
            throws Exception {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);

        try {

            int n;

            // read() function to read the
            // byte of data
            while ((n = in.read()) != -1) {
                // write() function to write
                // the byte of data
                out.write(n);
            }
        } finally {
            if (in != null) {

                // close() function to close the
                // stream
                in.close();
            }
            // close() function to close
            // the stream
            if (out != null) {
                out.close();
            }
        }
        System.out.println("File Copied");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        // source file
        File x = new File("C:\\Users\\hp\\Documents\\WT LAB CODE\\WT LAB-10\\que21.txt");


        // destination file
        File y = new File("C:\\Users\\hp\\Documents\\WT LAB CODE\\WT LAB-10\\que22.txt");

        
        copyContent(x, y);
    }
}