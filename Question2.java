import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    System.out.print("Input Height: "); 
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    System.out.print("Input Weight: "); 
    Scanner in2 = new Scanner(System.in);
    double weight = in2.nextDouble();
    double bmi = weight/(height*height);
    System.out.print(bmi);
  }
}
