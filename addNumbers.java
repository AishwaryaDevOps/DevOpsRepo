import java.util.Scanner;
 
class addNumbers
{
   public static void main(String args[])
   {
      int x, y, sum;
 
      System.out.println("Enter 2 integers to calculate their sum");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
      sum = x + y;
 
      System.out.println("Sum of the integers = " + sum);
   }
}
