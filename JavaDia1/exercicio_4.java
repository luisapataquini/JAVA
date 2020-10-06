package JavaDia1;

import java.util.Scanner;

public class exercicio_4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, r, s;
		
		System.out.println("Digite um valor para A:");
		a = ler.nextInt();
		System.out.println("Digite um valor para B:");
		b = ler.nextInt();
		System.out.println("Digite um valor para C:");
		c = ler.nextInt();
		
		r = Math.pow(a+b, 2.00);
		s = Math.pow(b+c, 2.00);
		d = (r+s)/2.00;
		
		System.out.println("A expressão D = " + d);
	}
}
