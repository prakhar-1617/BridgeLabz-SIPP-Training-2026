import java.io.*;
import java.util.*;
class customerfeedbackanalyser {
  
           public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        System.out.println("Enter 5 feedback messages:");

        for (int i = 0; i < 5; i++) {
            String feedback = br.readLine();

            // convert to lowercase for case-insensitive matching
            if (feedback.toLowerCase().contains("good")) {
                count++;
            }
        }

        System.out.println("Good Feedback Count = " + count);
    }
}