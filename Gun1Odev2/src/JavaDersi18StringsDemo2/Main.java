package JavaDersi18StringsDemo2;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		String yeniMesaj = mesaj.replace(' ', '_');				// Mesaj içerisinde bulunan karakterleri farklı bir karakterle değiştirmeye yarar. Ana mesajı değiştirmez.
		System.out.println(yeniMesaj);							
		System.out.println(mesaj.substring(2));					// Mesajı belirtilen indexinden itibaren yazdırır. Belirtilen index dahil.
		System.out.println(mesaj.substring(2,5));				// Mesajı belirtilen indexler arasında keser. Başlanan index dahil. Bitrilen index hariç. (2 dahil 5 hariç.)
		
		for (String kelime:mesaj.split(" ")) {					// Mesajı belirtilen karakteri baz alarak keser. (Bu durumda boşluğa göre.)
			
			System.out.println(kelime);
			
		}
		
		System.out.println(mesaj.toLowerCase());				// Mesajın tamamını küçük harfe çevirir.
		System.out.println(mesaj.toUpperCase());				// Mesajın tamamını büyük harfa çevirir.
		System.out.println(mesaj.trim());						// Mesajın başındaki ve sonundaki boşlukları atmaya yarar.
	}

}
