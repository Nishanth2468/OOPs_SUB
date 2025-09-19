import java.util.Scanner;

public class Scan {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   System.out.print("Enter an integer: ");
     int number = sc.nextInt();
     sc.close();
     System.out.println("Integer: " + number);
}
}