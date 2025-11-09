import java.util.Scanner;

public class Fibnonacci{
    public static void fibNonRecursive(int n) {
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: " + a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println(); // 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt(); 
        fibNonRecursive(n);
         


