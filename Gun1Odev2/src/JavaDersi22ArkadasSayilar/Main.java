package JavaDersi22ArkadasSayilar;

public class Main {

	public static void main(String[] args) {

		int number1 = 220;
		int number2 = 284;
		int bolenToplami1 = 0;
		int bolenToplami2 = 0;

		for (int i = 1; i < number1; i++) {

			if (number1 % i == 0) {

				bolenToplami1 = bolenToplami1 + i;

			}

		}
		
		for (int j = 1; j < number2; j++) {

			if (number2 % j == 0) {

				bolenToplami2 = bolenToplami2 + j;

			}

		}
		
		if (bolenToplami1 == number2) {
			if(bolenToplami2 == number1) {
				
				System.out.println(number1 + " ve " + number2 + " sayıları arkadaş sayılardır.");
				
			}
		} else {
			
			System.out.println(number1 + " ve " + number2 + " sayıları arkadaş sayı değillerdir.");
			
		}

	}

}
