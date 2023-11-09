/*14. Write a program in Java to display the pattern like a diamond.
While loop
*
***
*****
*******
*********
***********
*************
***********
*********
*******
*****
***
**/
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :- ");
        int number = scanner.nextInt();
        for (int i =1; i<=number; i++){
            for (int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    }

