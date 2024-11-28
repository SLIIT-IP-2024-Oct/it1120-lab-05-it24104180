import java.util.Scanner;

public class IT24104180Lab5Q1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Enter three integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();
        
        //Print the numbers entered by user
        System.out.println("User entered nymbers are: " + num1 + " " + num2 + " " + num3);
        
        // Find the smallest number
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        
        // Find the largest number
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        
        // Display the results
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
        
       
    }
}
