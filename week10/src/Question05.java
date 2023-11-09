/*Palindrome Number
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
Itshould return true ifthe number is a palindrome number otherwise itshould return false.
Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
11212.
Tip:What is a Palindrome number? A palindrome numberis a number which when reversed is equal
to the original number. For example: 121, 12321, and 1001 etc.
Tip: Logic to check a palindrome number
Find the reverse of the given number. Store itin some variable,say reverse. Compare the number
with the reverse.
If both are the same then the number is a palindrome otherwise it is not.*/
public class Question05 {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return originalNumber == reverse;
    }

    public static void main(String[] args) {
        System.out.println("isPalindrome :- "+isPalindrome(-1221));
        System.out.println("isPalindrome :- "+isPalindrome(707));
        System.out.println("isPalindrome :- "+isPalindrome(11212));

    }
}
