import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = input.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = input.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = input.next();
        double result = 0;

        if (operation.equals("add")) {
            result = a + b;
        } else if (operation.equals("subtract")) {
            result = a - b;
        } else if (operation.equals("multiply")) {
            result = a * b;
        } else if (operation.equals("divide")) {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Cannot divide by zero");
                return;
            }
        } else {
            System.out.println("Invalid operation");
            return;
        }

        System.out.println("Result: " + result);
    }
}
