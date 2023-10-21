package maquina_karaoke;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	MaquinaDeKaraoke mk = new MaquinaDeKaraoke();
	Scanner sc = new Scanner(System.in);
	int confirma;
	
	mk.adicionaMusica();
	
	System.out.println("Deseja tocar sua playlist? [1] Sim [2] Para adicionar mais músicas");

	confirma = sc.nextInt();

	if(confirma == 1) {
		mk.tocaMusica();
	}else {
		mk.adicionaMusica();
	}
}
}
