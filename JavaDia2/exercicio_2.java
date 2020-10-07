package JavaDia2;

import java.util.*;

public class exercicio_2 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int a ,b ,c;
		System.out.print("Digite um número: ");
		a = ler.nextInt();
		System.out.print("Digite um número: ");
		b = ler.nextInt();
		System.out.print("Digite um número: ");
		c = ler.nextInt();
		
		if(a < b) 
		{
			if(b < c) 
				{
				System.out.println("Ordem crescente: "+ a + "," + b + "," + c );
				} else if(a < c) {
					System.out.println("Ordem crescente: "+ a + "," + c + "," + b );
					} else {
						System.out.println("Ordem crescente: "+ c + "," + a + "," + b );
						}
		} else if (b < c) {
			if(a < c) 
			{
				System.out.println("Ordem crescente: "+ b + "," + a + "," + c );
			} else {
				System.out.println("Ordem crescente: "+ b + "," + c + "," + a );
				}	
		} else {
			System.out.println("Ordem crescente: "+ c + "," + b + "," + a );
		}
	}
}
