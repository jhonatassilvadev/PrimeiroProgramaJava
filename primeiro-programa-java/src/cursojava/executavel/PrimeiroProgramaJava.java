package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiroProgramaJava {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade carros?");
		String pessoa = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoa);

		int divisao = (int) (carroNumero / pessoaNumero);

		double resto = carroNumero % pessoaNumero;

		System.out.println("Divisão para pessoas deu " + divisao + " carros e sobrou " + resto + " carros.");

	}
}
