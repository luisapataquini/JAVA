package JavaDia4;

public class exercicio_1 {
	public static void main(String args[])
	{
		int[] A = {1, 0, 5, -2, -5, 7};
		int x;
		
		x = A[0] + A[1] + A[5];
		System.out.println("Soma dos valores das posições 0, 1 e 5 = " + x);
		A[4] = 100;
		for (int i : A) 
		{
			System.out.println("Vetor A: " + i);
		}
	}
}
