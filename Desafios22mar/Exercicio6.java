package aulastb;

import java.util.Scanner;

public class Exercicio6 {
	public static void main (String[] args) {	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite um número de 1 a 12: ");
	int mes = scanner.nextInt();
	
	switch (mes) {
	case 1,2,3:
		System.out.println("A estação é verão");
		break;
		
	case 4,5,6:
		System.out.println("A estação é Outono");
		break;
		
	case 7,8,9:
		System.out.println("A estação é Inverno");
		break;
		
	case 10,11,12:
		System.out.println("A estação é Primavera");
		break;
		
	default:
		System.out.println("Valor inválido");
		break;
	}
	scanner.close();

}
}