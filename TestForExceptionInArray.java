//Name: Asia Minor
//Date: 4-26-19
//Purpose: Algorithm Workbecnh chpater 11 number 3
//Write a method that searches a numeric array for a specified value. 
//The method should return the subscript of the element containing the value if it is found in the array. 
//If the value is not found, the method should throw an exception of the Exception class with the error message “Element not found”. 

import java.util.Scanner;

public class TestForExceptionInArray{
   public static void main(String [] args){
      int array[] = {12, 43, 12, 65, 24, 87, 12, 86 , 3, 25, 66};
      
      System.out.println("There is an array in this code. How many elements do you think is in this array?");
      Scanner kb = new Scanner(System.in);
      int guess = kb.nextInt();
      
      
      System.out.println("The number you chose was " + guess);
      
      try{
         System.out.println("The number in position " + guess + " was " + array[guess]);   
      } catch (Exception e){
         System.out.println("Error :/");
      }
   }
}