import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    //System.out.print("Enter integer:");
    Scanner in = new Scanner(System.in);
    int loop = in.nextInt();
    for (int i = loop; i > 0; i--){
      for (int e = 0; e < i; e++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
