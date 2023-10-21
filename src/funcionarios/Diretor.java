package funcionarios;

public class Diretor extends Funcionario{

	public Diretor(String nome, String matricula, Float salario) {
		super(nome, matricula, salario);
		// TODO Auto-generated constructor stub
	}
	
	public void calculaSalario() {
		salario = salario * 1.30f;
	}
}
