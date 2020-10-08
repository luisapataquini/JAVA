package JavaDia3;

import java.util.*;

public class exercicio_2 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int x, numero, par=0, impar=0;
		
		for(x=1;x<=10;x++)
		{
			System.out.print("Digite um número: ");
			numero = ler.nextInt();
			if(numero%2==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.printf(par +" números pares e " + impar  +" numeros ímpares.");
	}
}
