package funcionarios;

public class Gerente extends Funcionario{

	public Gerente(String nome, String matricula, Float salario) {
		super(nome, matricula, salario);
		// TODO Auto-generated constructor stub
	}
	
	public void calculaSalario() {
		salario = salario * 1.20f;
	}
}
