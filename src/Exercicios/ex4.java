package Exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero;
		
		System.out.println("Digite um n�mero inteiro: ");
		numero = entrada.nextInt();
		
		if(numero%2==0) {
			System.out.println("O n�mero � par e a raiz �: " +  Math.sqrt(numero));
		}
		else if(numero%2==1){
			System.out.println("O n�mero � �mpar e o quadrado �: " + Math.pow(numero, 2));
		}
	}
}
