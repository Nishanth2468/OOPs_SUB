import java.util.Scanner;

public class Data_types {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter an integer: ");
          int number = sc.nextInt();

          System.out.print("Enter a byte value: ");
          byte b = sc.nextByte();

          System.out.print("Enter a short value: ");
          short s = sc.nextShort();

          System.out.print("Enter an int value: ");
          int i = sc.nextInt();

          System.out.print("Enter a float value: ");
          float f = sc.nextFloat();

          System.out.print("Enter a char value: ");
          char c = sc.next().charAt(0);

          System.out.print("Enter a long value: ");
          long l = sc.nextLong();

          System.out.print("Enter a boolean value: ");
          boolean bool = sc.nextBoolean();

          sc.close();

          System.out.println("\nYou entered:");
          System.out.println("Integer: " + number);
          System.out.println("Byte: " + b);
          System.out.println("Short: " + s);
          System.out.println("Int: " + i);
          System.out.println("Float: " + f);
          System.out.println("Char: " + c);
          System.out.println("Long: " + l);
          System.out.println("Boolean: " + bool);
      }
  }