package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		float arraySum = 0f;
		
		for(int i = 0; i < array.length; i++) {
			arraySum += array[i];
		}
		
		System.out.println("Quelle est la moyenne des éléments du tableau ? \n");
		System.out.println("La somme de tous les élément est " + arraySum);
		System.out.println("La moyenne des éléments du tableau est :" + arraySum/array.length );
	}

}
