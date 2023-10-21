package funcionarios;

public class Funcionario {
	protected String nome, matricula;
	protected Float salario;
	
	public Funcionario(String nome, String matricula, Float salario) {
		super();
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public void calculaSalario() {
		
	}

	@Override
	public String toString() {
		return "Funcionario [Nome = " + nome + ", Matrícula = " + matricula + ", Salário = " + salario + "]";
	}
	
	
	
	
}
