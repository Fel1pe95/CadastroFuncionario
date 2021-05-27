package entidades;



import model.services.Busca;

public class Funcionario implements Busca{

	private String nome;
	private Integer matricula;
	private Double salario;
	
	
	

	public Funcionario() {
	}

	public Funcionario(String nome, Integer matricula, Double salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
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

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void aumentoSalarial(double aumento) {
		
	salario = salario +(salario*aumento/100);
	}
	
	

	public String toString() {
		return "\nNome: " + nome 
				+ "\nMatricula: " + matricula
				+ "\nSalario: " + salario + "\n";
	}

	
}
