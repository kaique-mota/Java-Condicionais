package Exercicios;

import java.util.Scanner;

public class Exercício2 {
/*Exercício 2- Faça um programa que entre com três números e coloque em ordem crescente.*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("Digite o primeiro número: ");
		x = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		y = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		z = entrada.nextInt();
		
		if(x<y && y<z) {
			System.out.println("A ordem crescente é: " + x + y + z);
		}
		else if(x<z && z<y) {
			System.out.println("A ordem crescente é: " + x + z + y);
		}
		else if(y<x && x<z) {
			System.out.println("A ordem crescente é: " + y + x + z);
		}
		else if(y<z && z<x) {
			System.out.println("A ordem crescente é: " + y + z + x);
		}
		else if(z<x && x<y) {
			System.out.println("A ordem crescente é: " + z + x + y); 
		}
		else {
			System.out.println("A ordem crescente é: " + z + y + x);
		}
	    entrada.close();
	}
}
