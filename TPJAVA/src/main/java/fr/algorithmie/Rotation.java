package fr.algorithmie;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ; 
		int[] newArray = new int[array.length];
		
		newArray[0] = array[array.length -1];
		
		for(int i = 1; i < array.length; i++ ) {
			newArray[i] = array[i - 1];
		}
		
		System.out.println("Le nouveau tableau est :" + Arrays.toString(newArray));
		

	}

}
