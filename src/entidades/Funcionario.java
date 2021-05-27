package entidades;

import java.util.ArrayList;
import java.util.List;

import model.services.Busca;

public class Funcionario implements Busca {

	private String nome;
	private Integer matricula;
	private Double salario;

	List<Funcionario> list = new ArrayList<>();

	public Funcionario() {
	}

	public Funcionario(String nome, Integer matricula, Double salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}

	public List<Funcionario> getList() {
		return list;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Double getSalario() {
		return salario;
	}

	public void aumentoSalarial(double aumento) {

		
		salario = salario + (salario * aumento / 100);
	}

	public void dadosFuncionario(Integer num) {

		if (list.get(num) == null) 
			System.out.println("matricula nao existe!");
		 else 
			System.out.println(list.get(num).toString());
		

	}

	public void cadastroFuncionario(String nome, Integer matricula, Double salario) {
		list.add(new Funcionario(nome, matricula, salario));
	}

	public String toString() {
		return "\nNome: " + nome + "\nMatricula: " + matricula + "\nSalario: " + salario + "\n";
	}

}
