package JavaDia2;

import java.util.*;

public class exercicio_3 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Diga qual é sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Categoria Infantil");
		}
		else if(idade>14 && idade<=17)
		{
			System.out.println("Categoria Juvenil");
		}
		else if(idade>17 && idade<=25)
		{
			System.out.println("Categoria Adulto");
		}
		else
		{
			System.out.println("Idade inválida.");
		}
	}
}
