package fr.declaration.variable;

public class ExerciceBoucleEtTests {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		
		System.out.println("Afficher l’ensemble des éléments du tableau grâce à une boucle");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Afficher l’ensemble des éléments dans l’ordre inverse du tableau");
		for(int i = array.length;i > 0; i--) {
			System.out.println(array[i-1]);
		}
		
		System.out.println("Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3 ");
		for(int i = 0; i < array.length; i++) {
			if(array[i] > 3) {
				System.out.println(array[i]);				
			}
		}
		
		System.out.println("Combiner une boucle et un test de manière à n’afficher que les entiers pairs ");
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) {
				System.out.println(array[i]);				
			}
		}
		
		System.out.println("Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs ");
		for(int i = 0; i < array.length; i++) {
			if(i%2 == 0) {
				System.out.println(i + ": " + array[i]);				
			}
		}
		
		System.out.println("Combiner une boucle et un test de manière à n’afficher que les entiers pairs ");
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2 == 1) {
				System.out.println(array[i]);				
			}
		}

	}

}
