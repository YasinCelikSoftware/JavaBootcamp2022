package lessons;

public class JavaLesson29VariableTypes {

	public static void main(String[] args) {
		
		//Value
		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.println(number2);
		
		int[] numbers1 = new int[]{1,2,3};
		int[] numbers2 = new int[] {4,5,6};
		numbers2 = numbers1; // numbers2'nin referans numarasını numbers1'in neferans numarasına eşitle.
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
	}

}
