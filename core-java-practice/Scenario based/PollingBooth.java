import java.util.Scanner;

public class PollingBooth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {

            System.out.print("\nEnter age (0 to exit): ");
            int age = sc.nextInt();

            // Special code to exit
            if (age == 0) {
                break;
            }

            // Eligibility check
            if (age >= 18) {

                System.out.println("Candidates:");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");

                System.out.print("Enter your vote (1-3): ");
                int vote = sc.nextInt();

                switch (vote) {
                    case 1:
                        candidate1Votes++;
                        System.out.println("Vote recorded for Candidate A");
                        break;

                    case 2:
                        candidate2Votes++;
                        System.out.println("Vote recorded for Candidate B");
                        break;

                    case 3:
                        candidate3Votes++;
                        System.out.println("Vote recorded for Candidate C");
                        break;

                    default:
                        System.out.println("Invalid vote");
                }

            } else {
                System.out.println("Not eligible to vote.");
            }
        }

        System.out.println("\n----- Election Results -----");
        System.out.println("Candidate A Votes: " + candidate1Votes);
        System.out.println("Candidate B Votes: " + candidate2Votes);
        System.out.println("Candidate C Votes: " + candidate3Votes);

        sc.close();
    }
}