package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] tab = new int[10];
		int Choice = 0;
		int numberChoice =0;
		boolean stop = false;
		int index =0;

		while(!stop) {
			System.out.println("Entrez l'action que vous voulez effectué");
			System.out.println("Option 1: Ajoute un nombre au tableau");
			System.out.println("Option 2: Affiche le tableau");
			System.out.println("Option 3: Arréter le script");
			
			Choice = scanner.nextInt();
			
			// Si c'est le choix 1
			if(Choice == 1) {
				System.out.println("Choisissez un nombre à ajouter ");
				
				// On demande à l'utilisataur un nombre et on le stock
				numberChoice = scanner.nextInt();
				tab[index] = numberChoice;				
				index ++;
				
				// Si le tableau est remplie on ajoute 10 case
				if(index%10 == 0) {
					tab = Arrays.copyOf(tab, tab.length + 10);
				}
				
			//Si c'est le choix 2	
			}else if(Choice == 2) {
				System.out.println(Arrays.toString(tab));
				
			//Si c'est le choix 3	
			}else if(Choice == 3) {
				stop = true;
				
			//Si ce n'est aucun des 3 choix on l'indique et le script boucle	
			}else {
				System.out.println("Ce choix n'existe pas");
			}
		}
	}
}


