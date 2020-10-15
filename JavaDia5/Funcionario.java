package JavaDia5;

public class Funcionario {
	String nomeDoFuncionario;
	String cargoDoFuncionario;
	String setorDaEmpresa;
	int tempoDeEmpresa;
	double salarioDoFuncionario;
	
	public Funcionario(String nome, String cargo, String setor, int tempo, double salario)
	{
		nomeDoFuncionario = nome;
		cargoDoFuncionario = cargo;
		setorDaEmpresa = setor;
		tempoDeEmpresa = tempo;
		salarioDoFuncionario = salario;
	}
	
	public String getDadosFuncionario()
	{
		String DadosFuncionario = "Nome: " + nomeDoFuncionario
								+ "\nCargo: " + cargoDoFuncionario
								+ "\nSetor: " + setorDaEmpresa
								+ "\nTempo de Empresa: " + tempoDeEmpresa + " anos"
								+ "\nSalário do Funcionário: " + salarioDoFuncionario;
		return DadosFuncionario;
	}
}
