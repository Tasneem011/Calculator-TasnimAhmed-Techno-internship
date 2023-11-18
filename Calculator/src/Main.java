import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a basic calculator that can perform
        //basic arithmetic operations such as addition,
        //subtraction, multiplication, and division.

        System.out.println("enter num 1");
        int num1 = scanner.nextInt();
        System.out.println("enter num 2");
        int num2 = scanner.nextInt();

        int total;
        total = sum(num1, num2);
        System.out.println( " total is " +total);
        int subtract;
        subtract = subtraction(num1, num2);
        System.out.println(" subtraction is "+subtract);
        int divide;
        divide = division(num1, num2);
        System.out.println(" division is "+divide);
        int multiply;
        multiply = multiplication(num1, num2);
        System.out.println("multiplication is "+multiply);

    }


    //function to perform sum;
    public static int sum(int a, int b) {

        return a + b;

    }

    // function to perform division;
    public static int division(int a, int b) {
        return a / b;
    }

    // function to perform subtraction
    public static int subtraction(int a, int b) {
        return a - b;
    }

    //function to prform multiplication
    public static int multiplication(int a, int b) {
        return a * b;
    }
}




