package JavaDia6;

public class Vendedor extends Pessoa{
	
	//atributos
	private double valorVendas;
	private double comissao;
	
	//construtor padrao
	public Vendedor(String nome, String endereco, String telefone, String cpf, int idade, double valorVendas, double comissao) {
		super(nome, endereco, telefone, cpf, idade);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	public void imprimirInfo() {
		System.out.println("\nNome do vendedor(a): " + getNome() 
						   +"\nCPF: " + getCpf()
						   +"\nIdade: " + getIdade()
						   +"\nTelefone: "+ getTelefone()
						   +"\nEndere�o: " + getEndereco()
						   +"\nValor Vendas: " + valorVendas
						   +"\nComiss�o: " + comissao + "%");
	}
	public void salarioTotal() {
		double salarioTotal = valorVendas + (valorVendas*comissao/100);
		System.out.println("O sal�rio total � = " + salarioTotal);
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
