//Name: Asia Minor
//Date: 4-26-19
//Purpose: Algorithm Workbecnh chpater 11 number 2

public class ExceptionTest2{
   public static void main(String [] args){
      int number;
      String str;
      try{
         str = "What's going on here?";
         number = Integer.parseInt(str);
         System.out.println("Greetings from the try statement ;)");
      } catch (NumberFormatException e){
         System.out.println("This is a Number Format Exception");
      } catch (IllegalArgumentException e){
         System.out.println("This is an Illegal Argument Exception");
      } finally{
         System.out.println("Hey there from the finally statement");
      }   
         System.out.println("Whew, Finally out of all these statements!");
   }
}