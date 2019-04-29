//Name: Asia Minor
//Date: 4-26-19
//Purpose: Algorithm Workbecnh chapter 11 number 4
//Write a statement that throws an IllegalArgumentException with the error message “Argument cannot be negative”

import java.util.Scanner;

public class NotNegative{

   public static void main(String [] args){
      
      System.out.println("Enter a positive integer please");
   
      Scanner kb = new Scanner(System.in);
      int num = kb.nextInt();
   
      if(num < 0 ){
         throw new IllegalArgumentException("Argument cannont be negative");
      }
         
   }
   
}