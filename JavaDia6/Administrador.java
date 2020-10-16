package JavaDia6;

import java.util.*;

public class Administrador extends Pessoa {
	
	Scanner ler = new Scanner(System.in);
	//atributos
	private double estadia;
	private double viagens;
	
	//construtor padrao
	public Administrador(String nome, String endereco, String telefone, String cpf, int idade, double estadia, double viagens)
	{
		super(nome, endereco, telefone, cpf, idade);
		this.estadia = estadia;
		this.viagens = viagens;
	}
	
	//constutor
	public void imprimirInfo() {
		System.out.println("\nNome do administrador: " + getNome() 
						   +"\nCPF: " + getCpf()
						   +"\nIdade: " + getIdade()
						   +"\nTelefone: "+ getTelefone()
						   +"\nEndereço: " + getEndereco());
	}
	public void totalAjuda() {
		double ajudaDeCustos = estadia + viagens;
		System.out.println("Ajuda de Custos: " + ajudaDeCustos);
	}
	//getters and setters
	public Scanner getLer() {
		return ler;
	}
	public void setLer(Scanner ler) {
		this.ler = ler;
	}

	public double getEstadia() {
		return estadia;
	}

	public void setEstadia(double estadia) {
		this.estadia = estadia;
	}

	public double getViagens() {
		return viagens;
	}

	public void setViagens(double viagens) {
		this.viagens = viagens;
	}
	
	
}
