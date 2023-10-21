package maquina_karaoke;
import java.util.LinkedList;
import java.util.Scanner;
public class MaquinaDeKaraoke {
	
		private String musica;
		private LinkedList<String> lista = new LinkedList<String>();
		private Scanner sc = new Scanner(System.in);
		
		public void adicionaMusica() {
			int i = 0;
			
			do {
				System.out.println("Digite a música que deseja adicionar:");
				musica = sc.nextLine();
				lista.add(musica);
				System.out.println("Deseja adicionar mais músicas? [1] Sim  [2] Para sair");
				i = sc.nextInt();
				sc.nextLine();
			}while(i==1);
			
			System.out.println("Lista de músicas"+lista);
			
		}

		public void tocaMusica() {
			System.out.println("Tocando Música:"+lista.getFirst());
			lista.removeFirst();
			System.out.println("Lista de músicas no momento: "+lista);
		}
	}


