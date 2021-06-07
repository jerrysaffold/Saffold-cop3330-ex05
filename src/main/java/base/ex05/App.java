package base.ex05;

import java.util.Scanner;

/*Exercise 5 - Simple Math
        You’ll often write programs that deal with numbers. And depending on the programming language you use,
        you’ll have to convert the inputs you get to numerical data types.

        Write a program that prompts for two numbers.
        Print the sum, difference, product, and quotient of those numbers as shown in the example output:

        Example Output
        What is the first number? 10
        What is the second number? 5
        10 + 5 = 15
        10 - 5 = 5
        10 * 5 = 50
        10 / 5 = 2
        Constraints
        Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
        Keep the inputs and outputs separate from the numerical conversions and other processing.
        Generate a single output statement with line breaks in the appropriate spots.*/
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String number1 = input.nextLine();

        System.out.print("What is the second number?: ");
        String number2 = input.nextLine();

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        int add = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n", num1, num2, add, num1, num2, subtract,
                num1, num2, multiply, num1, num2, divide);

    }
}