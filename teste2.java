package processo;

import java.io.PrintStream;
import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		PrintStream show = System.out;
		Scanner input = new Scanner(System.in);
		int valor = 0;
		int Termo1 = 0;
		int Termo2 = 1;
		int Termo3 = 0;

		show.println("Digite um número: ");
		valor = input.nextInt();
		while (valor > Termo3) {
			Termo3 = Termo1 + Termo2;
			Termo1 = Termo2;
			Termo2 = Termo3;
		}
		if ((valor == 0) || (valor == 1)) {

			show.println("O número faz parte da sequência de Fibonacci.");
		} else if (valor == Termo3) {
			show.println("O número faz parte da sequência de Fibonacci.");

		} else {
			show.println("O número digitado não faz parte da sequência de Fibonacci.");

		}

	}

}
