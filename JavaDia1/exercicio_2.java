package JavaDia1;

import java.util.Scanner;

public class exercicio_2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias;
		
		System.out.println("Escreva sua idade expressa em dias:");
		dias = ler.nextInt();
		
		anos = (dias/365);
		meses = (dias%365)/30;
		dias = (dias%365)%30;
		
		System.out.println("A sua idade é: " + anos + " anos," + meses + " meses e " + dias + " dias." );
	}

}
