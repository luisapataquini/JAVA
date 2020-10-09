package JavaDia4;

import java.util.*;

public class exercicio_4 {
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		double M[][] = new double [2][2];
		double N[][] = new double [2][2];
		double S[][] = new double [2][2];
		int l, c, opcao, constante;
		
		for (l=0; l<2; l++) {
			for (c=0; c<2; c++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", l+1, c+1);
				M[l][c] = entrada.nextDouble();
			}
		}
		System.out.println();
		for (l=0; l<2; l++) {
			for (c=0; c<2; c++) {
				System.out.printf("Insira o elemento N[%d][%d]: ", l+1, c+1);
				N[l][c] = entrada.nextDouble();
			}
		}
		System.out.println();
		System.out.println("Opções: \n 1) Somar as duas matrizes; \n 2) Subtrair a primeira matriz da segunda; \n 3) Adicionar uma constante as duas matrizes; \n 4) Imprimir as matrizes;");
		System.out.print("Escolha uma opção: ");
		opcao = entrada.nextInt();
		
		if(opcao == 1) {
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					S[l][c]=N[l][c]+M[l][c];
					System.out.printf("[ " + S[l][c] + " ]");
				}
				System.out.println();
			}
		} else if(opcao == 2) {
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					S[l][c]=N[l][c]-M[l][c];
					System.out.printf("[ " + S[l][c] + " ]");
				}
				System.out.println();
			}
		} else if(opcao == 3) {
			System.out.print("Constante: ");
			constante = entrada.nextInt();
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					M[l][c]=M[l][c] + constante;
					System.out.printf("[ " + M[l][c] + " ]");
				}
				System.out.println();
			}
			System.out.println();
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					N[l][c]=N[l][c] + constante;
					System.out.printf("[ " + N[l][c] + " ]");
				}
				System.out.println();
			}
		} else if(opcao == 4) {
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					System.out.printf("[ " + M[l][c] + " ]");
				}
				System.out.println();
			}
			System.out.println();
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					System.out.printf("[ " + N[l][c] + " ]");
				}
				System.out.println();
			}
		}
	}
}
