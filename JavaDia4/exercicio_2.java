package JavaDia4;

import java.util.*;

public class exercicio_2 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int V[] = new int [6];
		int soma=0, qtd=0;
		
		for(int i=0; i<6; i++) 
		{
			System.out.print("Digite um número: ");
			V[i] = entrada.nextInt();
		}
		System.out.println("Números pares: ");
		for (int i=0; i<6; i++) 
		{
			if(V[i] % 2 == 0) 
			{
				soma = soma + V[i];
				System.out.print(V[i] +  " ");
			}
		}
		System.out.println("\nNúmeros ímpares: ");
		for (int i=0; i<6; i++) 
		{
			if(V[i] % 2 != 0) 
			{
				System.out.print(V[i] +  " ");
				qtd++;
			}
		}
		System.out.println("\nSoma dos números pares: " + soma);
		System.out.println("Quantidade dos números ímpares: " + qtd);
	}
}
