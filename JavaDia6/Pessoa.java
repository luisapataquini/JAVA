package JavaDia6;

public class Pessoa {
	
	//atributos
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private int idade;
	
	//construtor padrao
	public Pessoa(String nome, String endereco, String telefone, String cpf, int idade) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	//construtor
	public void validarCpf() {
		if(getCpf().length()!= 11) {  //conta quantos caracteres tem no cpf
			System.out.print("CPF inválido. \n" );
		}
		else {
			System.out.println("CPF válido. \n");
		}
	}
	
	public void validarIdade() {
		if(getIdade() < 18) {
			System.out.println("Usuário menor de idade.");
		}
		else {
			System.out.println("Usuário maior de idade.");
		}
	}

	//getters and setters 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
