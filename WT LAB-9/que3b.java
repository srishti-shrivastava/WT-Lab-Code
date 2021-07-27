import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class que3b {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fOut = new FileOutputStream("Student.txt");
            String iRoll = "1905647";
            String iName = "Srishti Shrivastava";
            String iBranch = "CSE";
            String iUniversity = "KIIT";
            String nextLine = "\n";
            byte r[] = iRoll.getBytes();
            byte n[] = iName.getBytes();
            byte b[] = iBranch.getBytes();
            byte u[] = iUniversity.getBytes();
            byte nl[] = nextLine.getBytes();

            fOut.write(r);
            fOut.write(nl);
            fOut.write(n);
            fOut.write(nl);
            fOut.write(b);
            fOut.write(nl);
            fOut.write(u);
            fOut.write(nl);

            fOut.close();
            FileInputStream fin = new FileInputStream("Student.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}