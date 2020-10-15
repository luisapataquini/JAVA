package JavaDia5;

public class Cliente {
	String primeiroNome;
	int idadeCliente;
	String generoCliente;
	
	public Cliente (String nome, int idade, String genero)
	{
		primeiroNome = nome;
		idadeCliente = idade;
		generoCliente = genero;
	}
	
	public String getDadosCliente()
	{
		String DadosCliente = primeiroNome + ", " + idadeCliente + ", " + generoCliente;
		return DadosCliente;
	}
}
