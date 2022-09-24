package JavaDersi19MiniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = -1;
		
		String asalTespit = " sayısı asaldır.";
		
		if (number == 1) {
			
			System.out.println("1 Sayısı asal sayı değildir.");
			return;
		}
		
		if (number < 1) {
			
			System.out.println("Geçersiz sayı girdiniz.");
			return;
			
		}
		
		for(int i=2; i<number;i++) {
			
			if(number%i==0) {
				
				asalTespit = " sayısı asal değildir.";
				break;
			}
			
		}
		
		System.out.println(number + asalTespit);
		

	}

}
