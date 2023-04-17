import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    System.out.print("Enter number of integer:");
    Scanner in = new Scanner(System.in);
    int loop = in.nextInt();
    int[] arr = new int[loop];

    for (int i = 0; i < loop; i++){
      System.out.print("Enter integer:");
      arr[i] = in.nextInt();
    }
    int mode = 0;
    int maxCount = 0;
    for (int i = 0; i < loop; i++) {
        int count = 0;
        for (int j = 0; j < loop; j++) {
            if (arr[j] == arr[i]) {
                count++;
            }
            }
        if (count > maxCount) {
            maxCount = count;
            mode = arr[i];
        }
    }
    System.out.println("The mode is " + mode);
  }
}
