package funcionarios;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, String matricula, Float salario) {
		super(nome, matricula, salario);
		// TODO Auto-generated constructor stub
	}
	
	public void calculaSalario() {
		salario = salario * 1.10f;
	}
}
