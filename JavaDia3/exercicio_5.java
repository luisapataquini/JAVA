package JavaDia3;

import java.util.*;

public class exercicio_5 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int numero, soma=0;
		
		do {	
		System.out.print("Digite um número: ");
		numero = ler.nextInt();
		soma = numero + soma;
		} while(numero != 0);
		
		System.out.printf("A soma dos números digitados é = " + soma);
	}
}
