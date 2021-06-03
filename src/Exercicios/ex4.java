package Exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero;
		
		System.out.println("Digite um número inteiro: ");
		numero = entrada.nextInt();
		
		if(numero%2==0) {
			System.out.println("O número é par e a raiz é: " +  Math.sqrt(numero));
		}
		else if(numero%2==1){
			System.out.println("O número é ímpar e o quadrado é: " + Math.pow(numero, 2));
		}
	}
}
