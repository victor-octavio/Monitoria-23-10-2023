package funcionarios;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int flag = 1;
		String nomeAux, matAux;
		Float salAux;
		int tipo;
		
		LinkedList<Funcionario> listaFunc = new LinkedList<Funcionario>();	
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Informe nome:	");
			nomeAux = sc.nextLine();
			System.out.println("Informe matrícula:	");
			matAux = sc.nextLine();
			System.out.println("Informe salário:	");
			salAux = sc.nextFloat();
			
			System.out.println("Qual o cargo do funcionário? [1] Diretor, [2] Gerente e [3] Vendedor");
			tipo = sc.nextInt();
			
			switch (tipo) {
			case 1: 
				listaFunc.add(new Diretor(nomeAux, matAux, salAux));
				break;
			
			case 2:
				listaFunc.add(new Gerente(nomeAux, matAux, salAux));
				break;
			
			case 3:
				listaFunc.add(new Vendedor(nomeAux, matAux, salAux));
				break;
				
			}
			
			System.out.println("Deseja continuar adicionando funcionários? [1] Sim  [2] Não");
			flag = sc.nextInt();
			
			sc.nextLine(); 
			
		} while (flag==1);
		
			for(int i=0; i < listaFunc.size(); i++) {
				listaFunc.get(i).calculaSalario();
				System.out.println(listaFunc.get(i));
			}
		
	}
}