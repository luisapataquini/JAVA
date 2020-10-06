package JavaDia1;

import java.util.Scanner;

public class exercicio_8 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		double custofabrica, custoconsumidor;
		
		System.out.print("Digite o custo de fábrica: ");
		custofabrica = ler.nextDouble();
		
		custoconsumidor = custofabrica + custofabrica*0.28 + custofabrica*0.45;
		
		System.out.printf("O custo ao consumidor é = %.2f", custoconsumidor);
	}

}
