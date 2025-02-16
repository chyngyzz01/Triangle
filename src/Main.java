import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 3;
//        int c = 2;
//        int x = a + (b++) + c;
//        int y = a + (++b) + c;
//        System.out.println(x);
//        System.out.println(y);

//        int a = 4;
//        int s = ++a;
//        System.out.println(s);

        // Math methods
//      sqrt => kvadrat  25 tin kvadraty 5
//        double number1 = Math.sqrt(25);

        // pow => stepen 4 3 darajasy 4*4*4
//        double number2 = Math.pow(4, 3);

        // round => kaldygy jok kylyp chygaryp beret / okruglyaet 5.5 => 6 | 5.4 => 5 | 5.6 => 6
//        double number3 = Math.round(5.5);

        // ceil => butun sanga jogoru kozdoi okruglyaitete 3.1 => 4 | 3.9 => 4
//        double number4 = Math.ceil(3.1);

        // floor => butun sanga ailandyrat 3.4 => 3 | 3.7 => 3
//        double number5 = Math.floor(3.7);

        // get off random numbers you must write two number from 1 to 10
//        Random random = new Random();
//        int number = random.nextInt(1, 10);
//        int numberMinus1 = random.nextInt(-50, 10);

//        int firstRandomNumber = random.nextInt(3, 33);
//        int secondRandomNumber = random.nextInt(1, 11);
//        int thirdRandomNumber = random.nextInt(-1, 33);
//        System.out.println("random numbers "+firstRandomNumber +" a "+ secondRandomNumber + " b " +thirdRandomNumber);
//
//        System.out.println(firstRandomNumber+secondRandomNumber+thirdRandomNumber);


        // exam task1
//        Random random = new Random();
//        int[] arrayNums1 = new int[10];
//        int[] arrayNums2 = new int[5];
//
//
//        for (int i = 0; i < arrayNums1.length; i++) {
//            arrayNums1[i] = random.nextInt(1, 50);
//        }
//
//        for (int i = 0; i < arrayNums2.length; i++) {
//            arrayNums2[i] = random.nextInt(50, 100);
//        }
//
//        System.out.println(getTrueOrFalse(arrayNums1, arrayNums2));


//        int[] numbers = {4, 4,4};
//        System.out.println(isSameNums(numbers));









// Home task with class and gitHub
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





















    //int[] numbers = {1, 2, 3, 4, 5, 5, 5, 6, 7};
//    public static boolean isSameNums(int[] nums) {
//        boolean isNumsSame = false;
//        if (nums.length < 3) {
//            System.err.println("Please enter the array length more the 3!!!");
//        }
//        for (int i = 0; i < nums.length - 2; i++) {
//            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) isNumsSame = true;
//        }
//        return isNumsSame;
//    }

    // exam task1
//    public static boolean getTrueOrFalse(int[] array1, int[] array2) {
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < array1.length; i++) sum1 += array1[i];
//        for (int i = 0; i < array2.length; i++) sum2 += array2[i];
//        if (sum1 == sum2) {
//            return true;
//        } else {
//            return false;
//        }
//    }

}