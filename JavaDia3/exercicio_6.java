package JavaDia3;

import java.util.*;

public class exercicio_6 {
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int numero, qtd=0, soma=0;
		double media;
		
		do {
			System.out.print("Digite um n�mero inteiro: ");
			numero = ler.nextInt();
			if(numero % 3 == 0  && numero!=0)
			{
				qtd++;
				soma = soma + numero;
			}
		} while(numero!=0);
		
		media = soma/qtd;
		System.out.printf("A m�dia dos n�meros m�ltiplos de 3 � = " + media);
	}
}
