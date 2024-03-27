package aulastb;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String[] args) {	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite um número de 1 a 7: ");
	
	int numero = scanner.nextInt();
	
	String diaSemana;
	
	switch (numero) {
	
	case 1:
		diaSemana = "Domingo, é um final de semana.";
		break;
		
	case 2:
		diaSemana = "Segunda-Feira, um dia útil.";
		break;
		
	case 3:
		diaSemana = "Terça-Feira, um dia útil.";
		break;
		
	case 4:
		diaSemana = "Quarta-Feira, um dia útil.";
		break;
		
	case 5:
		diaSemana = "Quinta-Feira, um dia útil.";
		break;
		
	case 6:
		diaSemana = "Sexta-Feira, um dia útil.";
		break;
		
	case 7:
		diaSemana = "Sábado, é um final de semana.";
		break;
		
		default:
			diaSemana = "Dia inválido";
		break;
	}
	System.out.println("O dia da semana que corresponde ao número " + numero + " é " + diaSemana);
	scanner.close();
	}
}