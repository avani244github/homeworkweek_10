import java.util.Scanner;
/*-Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
Before the user entersthe number, print the message Enter number:
If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:-Use an endless while loop./-Create a class with the name MinAndMaxInputChallenge.*/
public class MinAndMaxInputChallengeQ_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        boolean firstans = true;
        while (true){
            System.out.println("Entar Number ");

            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                if (firstans){
                    min = number;
                    max = number;
                    firstans = false;
                }
                else {
                    min = Math.min(min,number);
                    max = Math.max(max,number);
                }
            }else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min number is :- "+min);
        System.out.println("Max number is :- "+max);

        scanner.close();
    }
}
