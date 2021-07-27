import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class que4 {
    public static void main(String[] args) throws IOException {
        try {
            String st ="";

            FileReader fr=new FileReader("Test.txt");
            int i;
            while((i=fr.read())!=-1) {
                if((char)i=='@'){
                    st=st+'#';
                }
                else {
                    st = st + (char) i;
                }
            }
            fr.close();
            FileWriter fw=new FileWriter("Test.txt",false);
            fw.write(st);
            fw.close();

            FileReader fre=new FileReader("Test.txt");
            int j;
            while((j=fre.read())!=-1) {
                System.out.print((char)j);}
            fre.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}