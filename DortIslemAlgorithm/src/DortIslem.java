import java.util.Scanner;

public class DortIslem {

	public static void main(String[] args) {
		int number1, number2, operations;

		Scanner scanf = new Scanner(System.in);
		System.out.println("******************");
		System.out.println("Operations \n");
		System.out.println("1- Add");
		System.out.println("2- Substance");
		System.out.println("3- Multiply");
		System.out.println("4- Division");
		System.out.println("******************");

		System.out.print("Please enter the first number : ");
		number1 = scanf.nextInt();

		System.out.print("Please enter the second number : ");
		number2 = scanf.nextInt();

		System.out.print("Please choose the operation : ");
		operations = scanf.nextInt();

		if (operations == 1) {

			System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));

		}

		if (operations == 2) {

			System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));

		}

		if (operations == 3) {

			System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));

		}

		if (operations == 4) {

			System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));

		}
	}

}
