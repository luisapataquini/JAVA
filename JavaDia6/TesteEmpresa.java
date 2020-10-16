package JavaDia6;

public class TesteEmpresa {
	public static void main(String args[])
	{
		Empregado luisa = new Empregado("Luisa","Rua X, nº200","9999-8888", "444.555.771-0", 20, 157, 3000, 10);
		Operario marcela = new Operario("Marcela", "Rua Y, n°300", "8765-4321", "777.888.333-12", 17, 2000, 10);
		Fornecedor joao = new Fornecedor("João", "Rua Z, nº400", "9999-4444", "888.999.333-12", 30, 5000, 3000);
		Administrador marcos = new Administrador("Marcos", "Rua W, nº 900", "8888-0000", "444.555.111.10", 25, 250, 400);
		Vendedor silvia = new Vendedor("Silvia", "Rua T, nº 300","9999-7777","476.987.325-90",40, 2500, 10);
		
		luisa.imprimirInfo();
		luisa.calcularSalario();
		luisa.validarCpf();
		marcela.imprimirInfo();
		marcela.calcularValorArtigo();	
		marcela.validarIdade();
		joao.imprimirInfo();
		joao.obterSaldo();
		marcos.imprimirInfo();
		marcos.totalAjuda();
		silvia.imprimirInfo();
		silvia.salarioTotal();	
		
	}
}
