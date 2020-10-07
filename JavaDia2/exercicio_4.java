package JavaDia2;

import java.util.*;

public class exercicio_4 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		if(numero%2==0)
		{
			System.out.println("O número é par.");
			System.out.printf("A raiz quadrada de " + numero + " é = " + Math.sqrt(numero));
		}
		else
		{
			System.out.println("O número é impar.");
			System.out.printf(numero + " elevado ao quadrado = " + Math.pow(numero, 2));
		}
	}
}
