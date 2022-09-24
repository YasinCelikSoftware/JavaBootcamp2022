package JavaDersi21MukemmelSayilar;

public class Main {

	public static void main(String[] args) {
		
		int number = 28;
		int bolenToplami = 0;
		
		for (int i=1;i<number;i++) {
			
			if(number%i == 0) {
				
				bolenToplami = bolenToplami + i;
				
			}
		}
		
		if(bolenToplami == number) {
			
			System.out.println(number + " sayısı mükemmel sayıdır.");
			
		}else {
			
			System.out.println(number + " sayısı mükemmel sayı değildir.");
			
		}

	}

}
