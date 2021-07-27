import org.apache.commons.io.FileUtils;
 
import java.io.File;
import java.io.IOException;
 
class Main
{
    private static boolean isEqual(File firstFile, File secondFile)
    {
        try {
            return FileUtils.contentEquals(firstFile, secondFile);
        } catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
    }
 
    public static void main(String[] args)
    {
        File firstFile = new File("first.txt");
        File secondFile = new File("second.txt");
 
        boolean equal = isEqual(firstFile, secondFile);
        if (equal) {
            System.out.println("Files are equal.");
        }
        else {
            System.out.println("Files are not equal.");
        }
    }
}