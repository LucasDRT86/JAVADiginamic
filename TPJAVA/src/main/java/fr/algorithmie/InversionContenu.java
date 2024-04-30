package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

		
		System.out.println("Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy");
		int[] arrayCopy = new int[array.length];
		
		for(int i = 0;  i < array.length; i++) {
			arrayCopy[i] = array[array.length -1 -i];
		}
		
		System.out.println("array: "+ Arrays.toString(array));
		System.out.println("arrayCopy: "+ Arrays.toString(arrayCopy));
	}
}
