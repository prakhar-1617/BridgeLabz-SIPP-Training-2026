

import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Calculator
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + add + ", " + sub + ", " + mul + ", and " + div);

        // 2. Area of Triangle
        System.out.print("\nEnter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is "
                + areaIn + " and sq cm is " + areaCm);

        // 3. Side of Square
        System.out.print("\nEnter perimeter of square: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is "
                + side + " whose perimeter is " + perimeter);

        // 4. Feet to Yards and Miles
        System.out.print("\nEnter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in yards is "
                + yards + " while the distance in miles is " + miles);

        // 5. Total Purchase Price
        System.out.print("\nEnter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR "
                + totalPrice + " if the quantity "
                + quantity + " and unit price is INR " + unitPrice);

        // 6. Quotient and Remainder
        System.out.print("\nEnter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("The Quotient is "
                + quotient + " and Reminder is "
                + remainder + " of two number "
                + num1 + " and " + num2);

        // 7. IntOperation
        System.out.print("\nEnter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        System.out.println("The results of Int Operations are "
                + result1 + ", "
                + result2 + ", "
                + result3 + ", "
                + result4);

        // 8. DoubleOperation
        System.out.print("\nEnter value of x: ");
        double x = sc.nextDouble();

        System.out.print("Enter value of y: ");
        double y = sc.nextDouble();

        System.out.print("Enter value of z: ");
        double z = sc.nextDouble();

        double dResult1 = x + y * z;
        double dResult2 = x * y + z;
        double dResult3 = z + x / y;
        double dResult4 = x % y + z;

        System.out.println("The results of Double Operations are "
                + dResult1 + ", "
                + dResult2 + ", "
                + dResult3 + ", "
                + dResult4);

        sc.close();
    }
}
