/*Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153*/
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any three digit number : ");
        int number = scanner.nextInt();
        int originalNumber, remainder,result =0;
        originalNumber = number;
        while (originalNumber != 0){
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /=10;
        }
        if (result == number)
            System.out.println(number + " is an Armstrong number");
        else
            System.out.println(number + "is not an Armstrong number");
    }
}
