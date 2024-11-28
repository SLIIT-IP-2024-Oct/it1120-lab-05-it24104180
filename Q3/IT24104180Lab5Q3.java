import java.util.Scanner;
     
public class IT24104180Lab5Q3 {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
      
          double chargesperday = 48000;
          int reserved = 0;

          

          System.out.print("Enter start date: ");
          int num1 = input.nextInt();
     
          System.out.print("Enter end date:");
          int num2 = input.nextInt();
 
          if (num1 < 1 || num1 > 31 || num2 < 1 || num2 > 31) {
                System.out.print("*ERROR* start date & End date must be between 1 and 31.");
                }

          else if ( num1 >= num2)
                {System.out.print("*ERROR* start date must be less than end date.");}

               else
               {reserved = num2 - num1 ;
               System.out.println("No of days reserved :" +reserved); }

          int discount ;
          if (reserved >= 5)
          { discount = 20; }

          else if (reserved >=3 && reserved <= 4)
          {discount = 10;}
          
               else
              {discount = 0;}

          double totalAmount = chargesperday*reserved*(100-discount)/100;
          System.out.println("Total Amount to be paid:" +totalAmount);
  }
}
