package JavaDia7;

public class Cavalo extends Animal{
	
	private String correr; //atributos
	
	//construtor vazio
	public Cavalo() 
	{
			
	}
	
	//construtor padrao
	public String getNome() {
		return "Cavalo: " + super.getNome() + "\nIdade: " + super.getIdade() + "\nSom: " + super.getSom() + "\nAção: " + this.getCorrer();
	}
	//getters and setters 
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}	
}
