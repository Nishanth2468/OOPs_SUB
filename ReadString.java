import java.util.Scanner;

public class ReadString {
  
      public static void main(String[] args) 
      {
      Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String input = sc.nextLine();
       System.out.print("You have entered:" +input);
       sc.close();
  }
  }