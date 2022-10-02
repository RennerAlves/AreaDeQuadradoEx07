package ListaDeExerc�cios;

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
				mensagem = ("Erro! Insira um valor v�lido.");
				System.out.println("Se for decimal, fa�a a " + "separa��o das casas decimais com v�rgula.");
				System.out.println(mensagem);

			}
		}
		System.out.println();
		System.out.print("O valor de lado que voc� inseriu foi: ");
		System.out.println(valorDoLado);

		System.out.println();
		System.out.println("A �rea de um quadrado � definido por Lado x Lado.");
		System.out.println("Portando,a �rea de um quadrado com este valor de lado �: ");
		System.out.println(valorDoLado * valorDoLado);

	}
}
