import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();
        int num = 1; 

        for (int i = 1; i <= a; i++) {
            System.out.print(num);
            if (i < a) {
                System.out.print(", ");
            }
            num += 2;         
     }
}
