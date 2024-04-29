package fr.declaration.variable;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		System.out.println("Affichez tous les nombres de 1 à 10");
		for(int i = 1; i <11; i++) {
			System.out.println(i);
		}
		
		System.out.println("Affichez 20 fois votre nom et votre prénom");
		for(int i = 0; i <21; i++) {
			System.out.println(i +": Lucas DORAT");
		}
		
		System.out.println("Affichez les éléments pairs de 2 à 100");
		for(int i = 1; i <101;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Affichez les éléments impairs de 1 à 99");
		for(int i = 1; i <101;i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
	}

}
