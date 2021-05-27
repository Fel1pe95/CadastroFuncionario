package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;

public class CadastroFuncionario {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		Funcionario funcionario = null;
		int resp;
		do {
			System.out.print("--------------------------------------------------------\n");
			System.out.println(
					"[1] - cadastro\n[2] - atualização de salario\n[3] - remoção de funcionario\n[4] - dados funcionarios\n[5] - Sair");
			System.out.println("--------------------------------------------------------");
			resp = entrada.nextInt();

			if (resp == 1) {

				System.out.print("Nome: ");
				entrada.nextLine();
				String nome = entrada.nextLine();
				System.out.print("Matricula: ");
				Integer matricula = entrada.nextInt();
				System.out.print("Salario: ");
				Double salario = entrada.nextDouble();
				funcionario = new Funcionario(nome, matricula, salario);
				list.add(funcionario);

			} else if (resp == 4) {

				System.out.print("matricula do funcionario: ");
				Integer matricula = entrada.nextInt();

				Integer pos = funcionario.posicao(list, matricula);

				if (pos == null) {
					System.out.println("matricula nao existe!");
				} else {

					System.out.println(list.get(pos));
				}

			} else if (resp == 2) {
				System.out.print("matricula do funcionario: ");
				Integer matricula = entrada.nextInt();

				Integer pos = funcionario.posicao(list, matricula);
				if (pos == null) {
					System.out.println("matricula nao existe!");
				} else {
					System.out.print("Porcentagem de aumento: ");
					Double aumento = entrada.nextDouble();
					list.get(pos).aumentoSalarial(aumento);

				}

			} else if (resp == 3) {
				System.out.print("matricula do funcionario: ");
				Integer matricula = entrada.nextInt();
				Integer pos = funcionario.posicao(list, matricula);

				if (pos == null) {
					System.out.println("matricula nao existe!");
				} else {

					list.remove(pos);
				}
			}

		} while (resp != 5);


		entrada.close();

	}

}
