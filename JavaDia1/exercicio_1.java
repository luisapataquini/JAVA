package JavaDia1;

import java.util.Scanner;

public class exercicio_1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, resultado;
		
		System.out.println("Escreva sua idade expressa em anos, meses e dias: ");
		anos = ler.nextInt();
		meses = ler.nextInt();
		dias = ler.nextInt();
		
		resultado = (anos*365 + meses*30 + dias);	
		
		System.out.println("A sua idade expressa em dias é: " + resultado);
	}
}
