//Name: Asia Minor
//Date: 4-26-19
//Purpose: Algorithm Workbench chapter 11 number 5 and 6?
//Write an exception class that can be thrown when a negative number is passed to a method

import java.util.Scanner;

public class ExceptionClassTest extends Exception{

   public ExceptionClassTest(int num){
      super("Negative number cannot be passed to a method");
   }

}
class ExceptionClassDemo{
   public static void main(String[] args) throws ExceptionClassTest{
   System.out.println("Enter a number a positive number please");
   
   Scanner kb = new Scanner (System.in);
   int num = kb.nextInt();
   
   isPositive(num);
   
   }
   public static void isPositive(int n) throws ExceptionClassTest {
   if (n < 0 )
      throw new ExceptionClassTest(n);
   else 
      System.out.println("That number is positve wow!");
   }
}
