package JavaDia6;

public class Fornecedor extends Pessoa {
	
	//atributos
	private double valorCredito;
	private double valorDivida;
	
	//construtor padrao
	public Fornecedor(String nome, String endereco, String telefone, String cpf, int idade, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone, cpf, idade);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	//construtores
	public void imprimirInfo() {
		System.out.println("\nNome do fornecedor(a): " + getNome() 
						   +"\nCPF: " + getCpf()
						   +"\nIdade: " + getIdade()
						   +"\nTelefone: "+ getTelefone()
						   +"\nEndereço: " + getEndereco()
						   +"\nValor Credito: " + valorCredito
						   +"\nValorDivida: " + valorDivida);
	}
	
	public void obterSaldo() {
		double saldo = valorCredito - valorDivida;
		System.out.println("O saldo referente ao fornecedor " + getNome() +  " é = " + saldo);
	}
	
	//getters and setters 
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	} 
	
}
