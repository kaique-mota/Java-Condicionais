package Exercicios;

import java.util.Scanner;

public class Exerc�cio2 {
/*Exerc�cio 2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("Digite o primeiro n�mero: ");
		x = entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		y = entrada.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		z = entrada.nextInt();
		
		if(x<y && y<z) {
			System.out.println("A ordem crescente �: " + x + y + z);
		}
		else if(x<z && z<y) {
			System.out.println("A ordem crescente �: " + x + z + y);
		}
		else if(y<x && x<z) {
			System.out.println("A ordem crescente �: " + y + x + z);
		}
		else if(y<z && z<x) {
			System.out.println("A ordem crescente �: " + y + z + x);
		}
		else if(z<x && x<y) {
			System.out.println("A ordem crescente �: " + z + x + y); 
		}
		else {
			System.out.println("A ordem crescente �: " + z + y + x);
		}
	    entrada.close();
	}
}
