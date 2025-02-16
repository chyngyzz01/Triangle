import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      Home task with class and gitHub
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.print("Enter the first number: ");
        triangle.a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        triangle.b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        triangle.c = scanner.nextInt();

        System.out.println(triangle.a + "см + " + triangle.b + "см + " + triangle.c + "см" + " = " + triangle.area());

    }
}