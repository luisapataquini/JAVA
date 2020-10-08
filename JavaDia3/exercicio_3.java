package JavaDia3;

import java.util.*;

public class exercicio_3 {
	public static void main(String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int idade, menor21=0, maior50=0;
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		while(idade!=-99)
		{
			if(idade<21)
			{
				menor21++;
			}
			else if(idade>50)
			{
				maior50++;
			}
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();
		}
		System.out.printf("\nA quantidade de pessoas menores que 21 anos é = " + menor21);
		System.out.printf("\nA quantidade de pessoas maiores que 50 anos é = " + maior50);
	}
}
