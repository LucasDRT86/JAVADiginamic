package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class Interfactif21Batons {

	public static void main(String[] args) {
		
		boolean end = false;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int numberChoice = 0;
		int batonQuantity = 21;
		
		int computerChoice = 0;
		
		while(!end) {
			if(batonQuantity < 1) {
				System.out.println("Vous avez gagné");
				break;
				}
			
			System.out.println("Choisissez le nombre de bâtons à retirer entre 1 et 3");
			numberChoice = scanner.nextInt();
			
			while(numberChoice <0 || numberChoice > 3 ) {
				System.out.println("Le nombre doit être en 1 et 3");
				numberChoice = scanner.nextInt();
			}
			
			batonQuantity -= numberChoice;
			System.out.println("Il reste "+ batonQuantity + " bâton");
			
			if(batonQuantity < 1) {
				System.out.println("Vous avez perdu");
				end = true;
				
			}else if(batonQuantity == 1) {
				System.out.println("Vous avez gagné");
				end = true;
				
			}else {
				computerChoice = random.nextInt(3) + 1;
				batonQuantity -= computerChoice;
				
				System.out.println("L'ordinateur retire " + computerChoice + " bâtons");
				System.out.println("Il reste "+ batonQuantity + " bâton");
			}
			
			
			
		}
	}

}
