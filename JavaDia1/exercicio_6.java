package JavaDia1;

import java.util.Scanner;

public class exercicio_6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x1, x2, y1, y2, a, b, d;
		
		System.out.print("Digite um valor para x1: ");
		x1 = ler.nextDouble();
		System.out.print("Digite um valor para x2: ");
		x2 = ler.nextDouble();
		System.out.print("Digite um valor para y1: ");
		y1 = ler.nextDouble();
		System.out.print("Digite um valor para y2: ");
		y2 = ler.nextDouble();
		
		a = Math.pow(x2-x1, 2.00);
		b = Math.pow(y2-y1, 2.00);
		d = Math.sqrt(a+b);
		
		System.out.printf("A distância entre os pontos = %.2f",d);
		
	}
}
