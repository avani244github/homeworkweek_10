import java.util.Scanner;

public class ReadinmbByUser01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (count<=10){
            System.out.println(count+1);

            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                sum += number;
                count++;
            }
            else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of the Number is "+sum);

        scanner.close();
    }

    }

