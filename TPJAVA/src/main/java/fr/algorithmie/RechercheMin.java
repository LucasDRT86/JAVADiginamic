package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		System.out.println("Rechercher le plus petit élément du tableau ");
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Le plus petit élément est: " + min);


	}

}
