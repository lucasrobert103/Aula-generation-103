package LacosCondicionais;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String [] args ) {
		
		Scanner ler = new Scanner(System.in);
		
		int a;
		
		System.out.println(" Digite um valor :");
		a = ler.nextInt();
		
		if (a % 2 == 0) {
			System.out.println(" Este n�mero � par e sua raiz quadrada � : " + Math.sqrt(a) );
		}
		else if (a % 2 != 0 ) {
			System.out.println(" Este n�mero � impar e seu valor ao quadrado � : " + a*a );
		}
		else {
			System.out.println(" Voc� digitou um valor invalido ");
		}
	}
}
