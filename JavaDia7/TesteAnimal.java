package JavaDia7;

public class TesteAnimal {
public static void main (String args[]) {
		
		Cachorro dog = new Cachorro();
		dog.setNome("Meg");
		dog.setIdade("5");
		dog.setSom("AuAu");
		dog.setCorrer("Correr");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Zorro");
		cavalo.setIdade("15");
		cavalo.setSom("hinn");
		cavalo.setCorrer("Correr");
		
		Preguica preguica = new Preguica();
		preguica.setNome("Fofinha");
		preguica.setIdade("10");
		preguica.setSom("zzzz");
		preguica.setSubir("Subir em árvores");
		
		Animal[] animais = new Animal[3];
		animais[0] = dog;
		animais[1] = cavalo;
		animais[2] = preguica;
		
		for(Animal loop: animais) //SuperClasse, variavel de loop, objeto 
		{
			System.out.println(loop.getNome()+"\n");
		}
	}
}
