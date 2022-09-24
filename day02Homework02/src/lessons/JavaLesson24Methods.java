package lessons;

public class JavaLesson24Methods {

	public static void main(String[] args) {
		
		findNumber();

	}
	
	public static void findNumber() {
		
		int[] numbers = new int[] {1,2,5,7,9};
		int search = 7;
		boolean isExist = false;
		
		for (int number : numbers) {
			
			if(search == number) {
				
				isExist = true;
				
			}
			
		}
		
		String message = "";
		
		if(isExist) {
			message = "The number : " + search + " isn't in list.";
			sendMessage(message);
			
		} else {
			
			sendMessage("The number : " + search + " isn't in list.");
			
		}
		
	}
	
	public static void sendMessage (String message) {
		
		System.out.println(message);
		
	}
	
}
