package JavaDia7;

public class Preguica extends Animal{
	
	private String subir; //atributos
	
	//construtor vazio
	public Preguica() 
	{
			
	}
	
	//construtor padrao
	public String getNome() {
		return "Preguiça: " + super.getNome() + "\nIdade: " + super.getIdade() + "\nSom: " + super.getSom() + "\nAção: " + this.getSubir();
	}
	//getters and setters 
	public String getSubir() {
		return subir;
	}
	public void setSubir(String subir) {
		this.subir = subir;		
	}
}
