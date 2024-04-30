package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Saisissez un nombre entre 1 et 10");
		int number = scanner.nextInt();
		
		while(1 > number || 10 < number) {
			System.out.println("Ce nombre doit être entre 1 et 10");
			number = scanner.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(number +" * "+ (i+1) + " = " + number*(i+1));
		}
	}

}
