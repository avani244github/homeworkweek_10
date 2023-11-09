/*3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg: Input an alphabet: p
Expected Output:Input letter is Consonant*/
import java.util.Scanner;

public class Question03 {
    public static boolean isVowel(char ch){
        return ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String alphabet = scanner.nextLine();
        if (alphabet.length()==1 && Character.isLetter(alphabet.charAt(0))){
            char inputChar = Character.toLowerCase((alphabet.charAt(0)));
            if (isVowel(inputChar)){
                System.out.println("Vowel");
            }
            else {
                System.out.println("consonant");
            }

        }
        else {
            System.out.println("Error : Please enter a single character between a and z or A and Z.");

        }
    }
}
