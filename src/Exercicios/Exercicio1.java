package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

/*Exerc�cio 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2, n3, maiorNumero;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = entrada.nextInt();
		
		if(n1>=n2 && n1>=n3){
			System.out.println("O maior n�mero �: " + n1);
		}
		else if(n2>=n1 && n2>=n3){
			System.out.println("O maior n�mero �: " + n2);
		}
		else {
			System.out.println("O maior n�mero �: " + n3);
		}
	}
}
