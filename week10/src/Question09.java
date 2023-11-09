/*Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)*/
import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int count =scanner.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.println("Fibonacci number : "+a+" "+b);
        for (int i =0; i <= count; i++){
            c = a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }
}
