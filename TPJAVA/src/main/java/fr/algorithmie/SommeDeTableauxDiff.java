package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] tab1 =  {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		int[] tab2 =  {-1, 12, 17, 14, 5, -9, 0, 18 } ; 
		
		// Créer un tableau  de la taille de la somme de la taille des deux autres
		int[] tab3 = new int[tab1.length + tab2.length];
		
		
		// Remplir le tableau 
		for( int i = 0; i < tab3.length; i++) {
			if (i < tab1.length) {
				tab3[i] = tab1[i];
			}
			else {
				tab3[i] = tab2[i - tab1.length];
			}
		}
		
		System.out.println("Créer un tableau qui contient la somme des 2 précédents tableaux");		
		System.out.println(Arrays.toString(tab3));

	}

}
