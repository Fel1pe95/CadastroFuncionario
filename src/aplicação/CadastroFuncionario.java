package aplicação;

import java.util.Scanner;

import entidades.Funcionario;
import entidades.Menus;

public class CadastroFuncionario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Funcionario f = new Funcionario();
		Menus menu = new Menus();
		int resp;
		do {
			menu.menus();
			resp = sc.nextInt();

			switch (resp) {
			case 1:

				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Matricula: ");
				Integer matricula = sc.nextInt();
				System.out.print("Salario: ");
				Double salario = sc.nextDouble();
				f.cadastroFuncionario(nome, matricula, salario);
				break;
			case 4:
				System.out.print("matricula do funcionario: ");
				matricula = sc.nextInt();
				Integer pos = f.posicao(f.getList(), matricula);
				f.dadosFuncionario(pos);
				break;
			case 2:
				System.out.print("matricula do funcionario: ");
				matricula = sc.nextInt();
				pos = f.posicao(f.getList(), matricula);
				if (pos == null) {
					System.out.println("matricula nao existe!");
				} else {
					System.out.print("Porcentagem de aumento: ");
					Double aumento = sc.nextDouble();
					f.getList().get(pos).aumentoSalarial(aumento);
				}
				break;
			case 3:
				System.out.print("matricula do funcionario: ");
				matricula = sc.nextInt();
				pos = f.posicao(f.getList(), matricula);
				if (pos == null) {
					System.out.println("matricula nao existe!");
				} else {

					f.getList().remove(pos);
				}
				break;

			}
		} while (resp != 5);

		sc.close();

	}

}
