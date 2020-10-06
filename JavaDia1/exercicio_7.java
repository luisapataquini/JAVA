package JavaDia1;

import java.util.Scanner;

public class exercicio_7 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.print("Digite um valor para a: ");
		a = ler.nextDouble();
		System.out.print("Digite um valor para b: ");
		b = ler.nextDouble();
		System.out.print("Digite um valor para c: ");
		c = ler.nextDouble();
		System.out.print("Digite um valor para d: ");
		d = ler.nextDouble();
		System.out.print("Digite um valor para e: ");
		e = ler.nextDouble();
		System.out.print("Digite um valor para f: ");
		f = ler.nextDouble();
		
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
		
		System.out.print("O valor de x = " + x + " e o valor de y = " + y);
		
		
	}
	
}
