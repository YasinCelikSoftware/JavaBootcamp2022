package lessons;

public class JavaLesson26VariableArguments {

	public static void main(String[] args) {
		
		String message = "The weather is very nice today.";
		System.out.println(message);
		String newMessage = sendCity();
		System.out.println(newMessage);
		int number = addition(15,7);
		System.out.println(number);
		int total = addition2(2,3,4);
		System.out.println(total);
	}

	public static void add() {
		
		System.out.println("Added.");
		
	}
	
	public static void delete() {
		
		System.out.println("Deleted.");
		
	}
	
	public static void update() {
		
		System.out.println("Updated.");
		
	}
	
	public static int addition(int number1, int number2) {
		
		return number1 + number2;
		
	}
	
	public static int addition2(int... numbers) {
		int total = 0;
		for(int number : numbers) {
			
			total += number;
			
		}
		return total;
	}
	
	public static String sendCity() {
		
		return "Ankara";
		
	}

}


