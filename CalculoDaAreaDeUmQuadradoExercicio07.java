package ListaDeExercícios;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculoDaAreaDeUmQuadradoExercicio07 {

	public static void main(String[] args) {
		
		String mensagem = null;
		double valorDoLado = 0;
		int numerosCorretos = 0;
		double[] sequenciaNumerica = new double[2];

		while (numerosCorretos != 1) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Insira o valor do lado do quadrado: ");

			try {
				valorDoLado = scanner.nextDouble();
				numerosCorretos++;
				
			} catch (InputMismatchException ex) {
				mensagem = ("Erro! Insira um valor válido.");
				System.out.println("Se for decimal, faça a " + "separação das casas decimais com vírgula.");
				System.out.println(mensagem);

			}
		}
		System.out.println();
		System.out.print("O valor de lado que você inseriu foi: ");
		System.out.println(valorDoLado);

		System.out.println();
		System.out.println("A área de um quadrado é definido por Lado x Lado.");
		System.out.println("Portando,a área de um quadrado com este valor de lado é: ");
		System.out.println(valorDoLado * valorDoLado);

	}
}
