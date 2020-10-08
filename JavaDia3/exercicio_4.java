package JavaDia3;

import java.util.*;

public class exercicio_4 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int idade, sexo, opcao, pessoa=1, calma=0, mnervosa=0, hagressivo=0, ocalmos=0, nervosos40=0, calmos18=0;
		
		while(pessoa<=150)
		{
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();
			System.out.print("Digite seu sexo, sendo (1) feminino, (2) masculino ou (3) outro: ");
			sexo = ler.nextInt();
			System.out.print("Digite se você é (1) calmo, (2) nervoso ou (3) agressivo: ");
			opcao = ler.nextInt();
			
			if(opcao==1){
				calma++;
			}
			if(opcao==2 && sexo==1){
				mnervosa++;
			}
			if(opcao==3 && sexo==2){
				hagressivo++;
			}
			if(opcao==1 && sexo==3){
				ocalmos++;
			}
			if(idade>40 && opcao==2){
				nervosos40++;
			}
			if(idade<18 && opcao==1){
				calmos18++;
			}
			pessoa++;
		}
		System.out.printf("\nO número de pessoas calmas = " + calma);
		System.out.printf("\nO número de mulheres nervosas = " + mnervosa);
		System.out.printf("\nO número de homens agressivos = " + hagressivo);
		System.out.printf("\nO número de outros calmos = " + ocalmos);
		System.out.printf("\nO número de pessoas nervosas com mais de 40 anos = " + nervosos40);
		System.out.printf("\nO número de pessoas calmas com menos de 18 anos = " + calmos18);
	}
}

