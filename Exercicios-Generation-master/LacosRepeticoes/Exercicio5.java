package LacosRepeticoes;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero , soma = 0; 
		
		do {
			
			System.out.println(" Digite um n�mero: ");
			numero = ler.nextInt();
			soma = soma + numero;
			
		}while(numero != 0);
		
		System.out.println(" Soma dos n�mero digitados: " + soma);
	}

}
