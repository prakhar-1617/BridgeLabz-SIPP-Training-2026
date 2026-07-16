import java.util.*;
import java.io.*;   

public class groceryBillReader {
    
    public static void main(String[] args) {

        int lineCount = 0;

        try {
            FileReader fr = new FileReader("bill.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);  // display line
                lineCount++;               // count line
            }

            br.close();
            fr.close();

            System.out.println("\nTotal number of lines = " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: bill.txt");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
    

