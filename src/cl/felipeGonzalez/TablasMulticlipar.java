package cl.felipeGonzalez;

import java.util.Scanner;

public class TablasMulticlipar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tabla;
		int i;

		for (tabla = 1; tabla <=20; tabla++) {

			System.out.println("\ntabla del " + tabla);
			System.out.println("---------------------");
			for (i = 1; i <=20; i++) {
				System.out.println(tabla + " x " + i + " = "+tabla*i);

			}
		}

	}

}
