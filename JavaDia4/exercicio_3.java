package JavaDia4;

import java.util.*;

public class exercicio_3 {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int M[][] = new int[3][3];
		int l, c, qtd=0;
		
		for (l=0; l<3; l++) {
			for (c=0;c<3; c++) {
				System.out.print("Digite um valor: ");
				M[l][c] = entrada.nextInt();
				if( M[l][c] > 10)
				{
					qtd++;
				}
			}
		}
		System.out.println("A matriz possui " + qtd + " valores maiores que 10.");
	}
}
