package models;

import java.util.Scanner;

public class ErroTipo {
	private static Scanner ler = new Scanner(System.in);
	
	public static int lerNum(String msg) {
		boolean vali = false;
		int valor = 0;
		do {
			try {
				System.out.println(msg);
				valor = Integer.parseInt(ler.next());
				vali = true;
			} catch (Exception e) {
				System.out.println("Tipos incompativeis");
			}
		} while (!vali);
		return valor;
	}
}
