package JavaDia6;

public class Operario extends Pessoa{
	
	//atributos
	private double valorProducao;
	private double comissao;
	
	//construtor padrao
	public Operario(String nome, String endereco, String telefone, String cpf, int idade, double valorProducao, double comissao) {
		super(nome, endereco, telefone, cpf, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	//construtor
	public void imprimirInfo() {
		System.out.println("\nNome do operário(a): " + getNome() 
						   +"\nCPF: " + getCpf()
						   +"\nIdade: " + getIdade()
						   +"\nTelefone: "+ getTelefone()
						   +"\nEndereço: " + getEndereco()
						   +"\nValor Producao: " + valorProducao
						   +"\nComissao: " + comissao + "%");
	}
	
	public void calcularValorArtigo() {
		double valor_total = valorProducao + (valorProducao*(comissao/100));
		System.out.println("O valor total a ser recebido pelo(a) operário(a) " + getNome() + " é = " + valor_total);
	}
	
	//getters and setters
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
