import java.io.*;

public class que1{
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file = new File("C:\\Users\\hp\\Documents\\WT LAB CODE\\WT LAB-10\\f1.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;

        // Initializing counters
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;


        // Reading line by line from the
        // file until a null is returned
        while ((line = reader.readLine()) != null) {

            characterCount += line.length();

            // \\s+ is the space delimiter in java
            String[] wordList = line.split("\\s+");

            countWord += wordList.length;

            // [!?.:]+ is the sentence delimiter in java
            String[] sentenceList = line.split("[!?.:]+");

            sentenceCount += sentenceList.length;

        }

        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);

    }
}