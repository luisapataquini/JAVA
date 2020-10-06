package JavaDia1;

import java.util.Scanner;

public class exercicio_5 {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		double n1, n2, n3, media;
		
		System.out.print("Digite a primeira nota: ");
		n1 = ler.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = ler.nextDouble();
		System.out.print("Digite a terceira nota: ");
		n3 = ler.nextDouble();
		
		media = (n1*2.00 +n2*3.00 + n3*5.00)/10.00;
		
		System.out.printf("A média final do aluno é = %.2f", media);
	
	}
}
