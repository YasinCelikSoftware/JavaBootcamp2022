package JavaDersi20SesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = 'Ü';

		if (harf == 'A' || harf == 'I' || harf == 'O' || harf == 'U') {

			System.out.println(harf + " harfi kalın sesli harftir.");

		}

		else if (harf == 'E' || harf == 'İ' || harf == 'Ö' || harf == 'Ü') {

			System.out.println(harf + " harfi ince sesli harftir.");

		}
		else {
			
			System.out.println("Hatalı giriş yaptınız.");
			
		}

	}

}
