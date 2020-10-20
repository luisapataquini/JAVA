package JavaDia8;

import java.util.*;

public class Estoque {
	public static void main(String args[]) {

		int opcao;
		String produto;
		Collection<String> estoque = new ArrayList();
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha uma das op��es a seguir: " + "\n1) Adicionar um produto ao estoque"
				+ "\n2) Remover um produto do estoque" + "\n3) Substituir um produto do estoque"
				+ "\n4) Mostrar o estoque" + "\n0) Sair do programa");

		opcao = ler.nextInt();
		do {
			if (opcao == 1) {
				System.out.println("Qual produto voc� gostaria de adicionar? ");
				produto = ler.next();
				estoque.add(produto);
			} else if (opcao == 2) {
				System.out.println("Qual produto voc� gostaria de remover? ");
				produto = ler.next();
				estoque.remove(produto);
			} else if (opcao == 3) {
				System.out.println("Qual produto voc� gostaria de substituir? ");
				produto = ler.next();
				if (estoque.contains(produto)) {
					estoque.remove(produto);
					System.out.println("\nDigite o novo produto:");
					produto = ler.next();
					estoque.add(produto);
				}
			} else if (opcao == 4) {
				System.out.println(estoque);
			} else {
				System.out.println("Op��o inv�lida");
			}
			System.out.println("Escolha uma nova op��o: ");
			opcao = ler.nextInt();
		} while (opcao != 0);

	}
}
