public class fibonnaic {
    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
