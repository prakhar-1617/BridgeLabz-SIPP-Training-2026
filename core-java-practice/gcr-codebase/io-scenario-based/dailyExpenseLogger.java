
import java.io.*;
public class dailyExpenseLogger {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            FileWriter fw = new FileWriter("expenses.txt", true); // append mode
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);

            System.out.print("Enter number of expenses: ");
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {

                System.out.print("Enter expense category: ");
                String category = br.readLine();

                System.out.print("Enter amount: ");
                int amount = Integer.parseInt(br.readLine());

                out.println(category + " - " + amount);
            }

            out.close();

            System.out.println("Expenses saved successfully!");

        } catch (IOException e) {
            System.out.println("Error while handling file: " + e.getMessage());
        }
    }
}
