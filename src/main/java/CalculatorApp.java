import java.util.Arrays;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.print("what is the first number?");
      int num1 = input.nextInt();

      System.out.print("What is the second number?");
      int num2 = input.nextInt();

      int operation = num1 * num2;

      System.out.print(operation);
    }
}
