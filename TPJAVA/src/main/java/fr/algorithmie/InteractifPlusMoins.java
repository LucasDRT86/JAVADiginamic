package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Random rand = new Random();
		int randomNumber = rand.nextInt(100) + 1;
		

		System.out.println("Choisissez un nombre entre 1 et 100");
		int userNumber = scanner.nextInt();
		
		int tentative = 1; // Tentative et à un comme on le premier choix doit compter
		while(randomNumber != userNumber) {
			
			if(userNumber > randomNumber ){
				
				System.out.println("C'est moins");
				userNumber = scanner.nextInt();
			}else {
				System.out.println("C'est plus");
				userNumber = scanner.nextInt();
			}
			tentative++;
		}
		System.out.println("Bravo, vous avez trouvé en "+tentative +" coups ");
		

	}

}
