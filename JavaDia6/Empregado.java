package JavaDia6;

public class Empregado extends Pessoa {
	
	//atributos 
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	//construtor padrao
	public  Empregado (String nome, String endereco, String telefone, String cpf, int idade, int codigoSetor, float salarioBase, float imposto) {
		super(nome, endereco, telefone, cpf, idade); //herda os parametros da superclasse
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	//construtor 
	public void imprimirInfo() {
		System.out.println("\nNome do empregado(a): " + getNome() 
						   +"\nCPF: " + getCpf()
						   +"\nIdade: " + getIdade()
						   +"\nTelefone: "+ getTelefone()
						   +"\nEndereço: " + getEndereco()
						   +"\nCódigo do Setor: " + codigoSetor
						   +"\nSalário Base: " + salarioBase
						   +"\nImposto " + imposto +"%");
	}
	
	public void calcularSalario() {
		double salario_total = salarioBase - salarioBase*(imposto/100);
		System.out.println("O salário total do empregado " + getNome() + " é = " + salario_total);			
	}

	//getters and setters
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
}
