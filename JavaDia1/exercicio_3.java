package JavaDia1;

import java.util.Scanner;

public class exercicio_3 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int segundos, horas, minutos; 
		
		System.out.println("Escreva o tempo de dura��o em segundos: ");
		segundos = ler.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		segundos = (segundos%3600)%60;
		
		System.out.println("O tempo de dura��o do seu evento �: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
	}
}
