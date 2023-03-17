package processo;

import java.util.Scanner;

public class teste3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String s;

		System.out.println("Entrada: ");
		s = ler.nextLine();

		System.out.println(" ");

		System.out.printf("Entrada: %s\n ", s);
		System.out.printf("saida : %s\n ", invertercarateres(s));
	}

	public static String invertercarateres(String s) {
		int i, n;
		String aux;
		aux = "";
		n = s.length();
		for (i = (n - 1); i >= 0; i--) {
			aux = aux + s.charAt(i);
		}
		return (aux);

	}
}
