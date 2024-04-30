package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		int[] tab = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Saisissez le nombre numéro: "+(i+1));
			tab[i] = scanner.nextInt();
		}

		System.out.println("Rechercher le plus grand nombre");
		int max = tab[0];
		for(int i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		System.out.println("Le plus grand nombre est: " + max);

	}

}
