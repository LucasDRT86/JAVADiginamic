package fr.declaration.variable;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		
		int[] tab = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Affichez le premier élément du tableau");
		System.out.println(tab[0]);
		
		System.out.println("Affichez la longueur du tableau en utilisant la propriété lengthu");
		System.out.println("Longueur: "+tab.length);
		
		System.out.println("Affichez le dernier élément du tableau en utilisant la propriété length");
		System.out.println(tab[tab.length -1]);
		
		System.out.println("Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8.");
		tab[4] = 8;
		System.out.println(tab[4]);
		
	}

}
