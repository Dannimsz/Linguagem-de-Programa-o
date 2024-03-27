package aulastb;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número e descubra seu fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        int contador = 1;

        while (contador <= numero) {
            fatorial *=contador;
            contador++;
        }
        System.out.println("O resultado é: " + fatorial);
        scanner.close();
    }
}