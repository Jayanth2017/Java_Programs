import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int a = input.nextInt();

        int count = (a % 2 == 0) ? a - 1 : a;
        int num = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(num);
            if (i < count) {
                System.out.print(", ");
            }
            num += 2;
        }
    }
}
