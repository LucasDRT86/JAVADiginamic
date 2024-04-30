package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Saisissez un nombre");
		int number = scanner.nextInt();

		int result = 0;
		for(int i = 0; i <= number; i++) {
			result += i;
		}
		
		System.out.println(result);
	}

}
