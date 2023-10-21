package lapiseira;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	
	int i = 0;
	String marcaAux, corAux;
	String grafiteAux;
		
	LinkedList<Lapiseira> listaLapiseira = new LinkedList<Lapiseira>();
	
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println("Informe a marca: ");
		marcaAux = sc.nextLine();
		System.out.println("Informe a cor: ");
		corAux = sc.nextLine();
		System.out.println("Informe o grafite: ");
		grafiteAux = sc.nextLine();
		
		listaLapiseira.add(new Lapiseira(marcaAux, corAux, grafiteAux ));
		
		System.out.println("Deseja Adicionar mais lapiseiras? [1] Sim [2] Imprimir a lista");
		i=sc.nextInt();
		
		sc.nextLine();
		
		
	}while (i==1);
	
	
	System.out.println("Lista:"+listaLapiseira);
	sc.close();
}
}
