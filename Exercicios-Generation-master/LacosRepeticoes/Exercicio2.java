package LacosRepeticoes;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero,x,impar = 0,par = 0;
		
		for(x = 1 ; x <= 10; x++) {
			System.out.println(" Digite um n�mero :  ");
			numero = ler.nextInt();
			
				if(x % 2 == 0) {
					par++;
				}
				
				else if(x % 2 != 0) {
					impar++;
				}
		}
		System.out.println(" Dos 10 n�meros " + par + " s�o pares");
		System.out.println(" Dos 10 n�meros " + impar + " s�o impares");
	}

}
