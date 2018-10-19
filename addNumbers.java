import java.util.Scanner;
 
class AddNumbers
{
   public static void main(String args[])
   {
      int x, y, sum;
 
      System.out.println("Enter two integers to calculate their addition");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
      sum = x + y;
 
      System.out.println("Sum of the integers = " + sum);
   }
}
