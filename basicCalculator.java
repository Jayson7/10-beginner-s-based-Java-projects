import java.util.Scanner;

public class basicCalculator {
  public static void main(String[] args) {
    // Initialize scanner
    Scanner scanner = new Scanner(System.in);

    // Get user input
    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();
    System.out.print("Enter operation (+, -, *, /): ");
    char operation = scanner.next().charAt(0);

    double result;

    // Perform calculation based on operation
    if (operation == '+') {
      result = num1 + num2;
    } else if (operation == '-') {
      result = num1 - num2;
    } else if (operation == '*') {
      result = num1 * num2;
    } else if (operation == '/') {
      if (num2 != 0) {
        result = num1 / num2;
      } else {
        System.out.println("Error: Division by zero is not allowed.");
        scanner.close();
        return; // Exit to prevent an undefined result
      }
    } else {
      System.out.println("Error: Invalid operation.");
      scanner.close();
      return;
    }

    // Display result
    System.out.println("Result: " + result);

    // Close scanner
    scanner.close();
  }
}
