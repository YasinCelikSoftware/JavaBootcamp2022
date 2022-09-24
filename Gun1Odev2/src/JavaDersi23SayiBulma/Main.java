package JavaDersi23SayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = {1,2,5,7,9,0};
		int aranacak = 0;
		boolean isExist = false;
		
		for(int sayi:sayilar) {
			
			if(sayi == aranacak) {
				
				isExist = true;
				break;
				
			} 
		}

		if(isExist) {
			
			System.out.println(aranacak + " sayısı listede vardır.");
			
		}else {
			
			System.out.println(aranacak + " sayısı listede yoktur.");
			
		}
	}

}
