package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

/*Exercício 1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2, n3, maiorNumero;
		
		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = entrada.nextInt();
		
		if(n1>=n2 && n1>=n3){
			System.out.println("O maior número é: " + n1);
		}
		else if(n2>=n1 && n2>=n3){
			System.out.println("O maior número é: " + n2);
		}
		else {
			System.out.println("O maior número é: " + n3);
		}
	}
}
