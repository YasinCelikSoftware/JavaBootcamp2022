package JavaDersi17StringsDemo;

public class Main {
	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel.";

		System.out.println(mesaj);

		System.out.println("Cümledeki eleman sayısı : " + mesaj.length());			// Mesajın uzunluğunu gösterir.
		System.out.println("5. eleman : " + mesaj.charAt(4));						// Mesajdaki 5. elemanı (4. index) gösterir.
		System.out.println(mesaj.concat(" Yaşasın!"));								// Ana mesajı yazılan mesaj ile birleştirir. Ana mesajı değiştirmez.
		System.out.println(mesaj.startsWith("B"));									// Mesajın ne ile başladığını sorgulamaya yarar. 1 veya 0 döndürür.
		System.out.println(mesaj.endsWith("."));									// Mesajın ne ile bittiğini sorgulamaya yarar. 1 veya 0 döndürür.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);										// 0 ile 4 dahil olmak üzere 0 ve 4. karakterler arasındaki karakterleri yazdırır.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));									// Yazdığımız karakter/karakterlerin kaçıncı indexte olduğunu gösterir. Aramaya baştan başlar.
		System.out.println(mesaj.lastIndexOf('a'));									// Yazdığımız karakter/karakterlerin kaçıncı indexte olduğunu gösterir. Aramaya sondan başlar.
	}
}
