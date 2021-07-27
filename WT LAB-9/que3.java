import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class que3 {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fw=new FileWriter("Student1.txt");
            String iRoll = "1905647";
            String iName = "Srishti Shrivastava";
            String iBranch = "CSE";
            String iUniversity = "KIIT";
            String nextLine = "\n";

            fw.write(iRoll);
            fw.write(nextLine);
            fw.write(iName);
            fw.write(nextLine);
            fw.write(iBranch);
            fw.write(nextLine);
            fw.write(iUniversity);
            fw.write(nextLine);

            fw.close();

            FileReader fr=new FileReader("Student1.txt");
            int i;
            while((i=fr.read())!=-1) {
                System.out.print((char)i);}
            fr.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}