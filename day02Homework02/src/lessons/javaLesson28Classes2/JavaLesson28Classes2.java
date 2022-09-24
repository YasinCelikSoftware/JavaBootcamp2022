package lessons.javaLesson28Classes2;

public class JavaLesson28Classes2 {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.add();
		customerManager.delete();
		customerManager.update();
		
	}

}
