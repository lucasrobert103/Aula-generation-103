package LacosRepeticoes;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = 0,  numeroMultiplos = 0;
		double media = 0,soma = 0;
		
		do {
			System.out.println(" Digite um n�mero: ");
			numero = ler.nextInt();
			if(numero % 3 == 0 && numero != 0) {
				numeroMultiplos++;
				soma = soma + numero;
			}
			
		}while(numero != 0);
		
		media = soma/numeroMultiplos;
		
		System.out.println(" M�dia dos n�meros m�ltiplos de 3: " + media);
		
	}

}
