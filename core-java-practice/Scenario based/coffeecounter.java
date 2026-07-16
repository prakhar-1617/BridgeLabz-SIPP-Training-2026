import java.util.*;

public class coffeecounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
   int bill = 0;
        while(true){

            System.out.print("Enter coffee type: ");
            String type = sc.nextLine();

            if(type.equalsIgnoreCase("Exit")){
                System.out.println("Exiting the program.");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            switch(type){

                case "Espresso":
                    bill = quantity * 100;
                    break;

                case "Cappuccino":
                    bill = quantity * 150;
                    break;

                case "Latte":
                    bill = quantity * 200;
                    break;

                case "Mocha":
                    bill = quantity * 250;
                    break;

                default:
                    System.out.println("Invalid coffee type");
                    continue;
            }
        }

            double gst = bill * 0.18;
            double finalBill = bill + gst;

            System.out.println("Bill: " + bill);
            System.out.println("GST: " + gst);
            System.out.println("Final Bill: " + finalBill);
            System.out.println();
        }

      
    }

