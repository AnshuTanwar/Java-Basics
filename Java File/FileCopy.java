import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {
        // Specify the paths of the source and destination text files
        String sourceFilePath = "C:\Users\aansh\OneDrive\Documents\Desktop\Java File\sample.txt";
        String destinationFilePath = "C:\Users\aansh\OneDrive\Documents\Desktop\Java File\destination.txt";

        try {
            // Create FileReader and BufferedReader for the source file
            FileReader fileReader = new FileReader(sourceFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Create FileWriter and BufferedWriter for the destination file
            FileWriter fileWriter = new FileWriter(destinationFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Read each line from the source file and write it to the destination file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Add a newline character after each line
            }

            // Close the readers and writers
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
