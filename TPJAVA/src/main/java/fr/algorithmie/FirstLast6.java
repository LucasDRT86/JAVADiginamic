package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int[] array = {6, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		
		boolean value = false;
		
		Integer firstvalue = array[0];
		if(firstvalue != null) {
			if(array[0] == 6 || array[array.length -1] == 6) {
				value = true;
			}
		}
		
		System.out.println(value);
		
	}

}
