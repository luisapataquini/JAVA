package JavaDia3;

public class exercicio_1 {
	public static void main (String args[])
	{
		int x;
		
		for(x=1000;x<=1999;x++)
		{
			if( x % 11 == 5 )
			{
				System.out.printf(x + " ");
			}
		}
	}
}