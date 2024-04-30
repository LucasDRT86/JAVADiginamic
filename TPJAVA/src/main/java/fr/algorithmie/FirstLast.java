package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 1} ;
		
		boolean value = false;
		
		if(array.length >= 1) {
			if(array[0] == array[array.length -1]) {
				value = true;
			}
		}

		System.out.println(value);
	}

}
