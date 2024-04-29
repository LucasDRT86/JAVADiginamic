package fr.declaration.variable;

public class ExerciceDeclarationTab {
	
	public static void main(String[] args) {

	int [] tab =  {-8,-7,12,1,-2,14,17,19};
	
	System.out.println(tab[0]);
	System.out.println(tab.length);
	System.out.println(tab[tab.length -1]);
	System.out.println(tab[10]); // Parceque la cellule 10 n'existe pas
	}
}
