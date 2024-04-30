package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		System.out.println("Affichez tous les nombres de 1 à 10 avec for");
		for(int i = 1; i <11; i++) {
			System.out.println(i);
		}

		
		System.out.println("Affichez les éléments pairs de 0 à 10 avec for");
		for(int i = 0; i <=10;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Affichez les éléments impairs de 0 à 9 avec for");
		for(int i = 0; i <=9;i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
		
		System.out.println("Affichez tous les nombres de 1 à 10 avec while");
		
		int j = 0;
		
		while(j <= 10 ) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("Affichez tous les nombres pairs de 0 à 10 avec while");
		
		int k = 0;
		
		while(k <= 10 ) {
			if(k%2 == 0) {
				System.out.println(k);
			}
			k++;
		}
		
		System.out.println("Affichez tous les nombres pairs de 0 à 10 avec while");
		
		int l = 0;
		
		while(l <= 10 ) {
			if(l%2 == 1) {
				System.out.println(l);
			}
			l++;
		}
	}

}
