package entidade;

public abstract class Funcionario {
	public static double SALARIOMINIMO = 1320.0;
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public void calcularSalario() {
		//falta implementar
	}
	
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}
	
	
	
	
	
	
	
	

}
