//Name: Asia Minor
//Date: 4-26-19
//Purpose: Algorithm Workbecnh chpater 11 number 1

public class ExceptionTest{
   public static void main(String [] args){
      int number;
      String str;
      try{
         str = "Hello there!";
         number = Integer.parseInt(str);
      } catch (NumberFormatException e){
         System.out.println("This is a Number Format Exception");
      } catch (IllegalArgumentException e){
         System.out.println("This is an Illegal Argument Exception");
      }
      System.out.println("Hey there ;)");
   }
}