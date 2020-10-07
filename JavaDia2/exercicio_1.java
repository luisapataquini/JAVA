package JavaDia2;

import java.util.*;

public class exercicio_1 {
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
		
		if (a > b)
        {
            if(a > c) 
            {
            	System.out.printf("O maior é " + a);
            }
            else System.out.println("O maior é " + c);
        }
        else
        {
            if (b > c)
            {	
            	System.out.println("O maior é " + b);
            }
            else System.out.println("O maior é " + c);
        }
	}
}
