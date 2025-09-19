import java.util.Scanner;

public class Sum_Avg{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int sum  = 0;

        for(int i = 1; i <=3 ; i++){
            System.out.println("Enter there values: ");
            sum += in.nextInt();

        }

        float avg = sum/3f;

        System.out.println("Total: " +sum);
        System.out.println("Average: " +avg);

    }
}