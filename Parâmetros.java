package aulas;

import java.util.Scanner;

public class atividade2401 {

	public void soma(double v1, double v2) {
		double soma = 0;
		soma = v1 + v2;
		System.out.println(soma);
	}

	public void sub(double v1, double v2) {
		double sub = 0;
		sub = v1 - v2;
		System.out.println(sub);
	}

	public void mult(double v1, double v2) {
		double mult = 0;
		mult = v1 * v2;
		System.out.println(mult);
	}

	public void div(double v1, double v2) {
		double div = 0;
		div = v1 / v2;
		System.out.println(div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		atividade2401 usuario = new atividade2401();
		
		double valor1=2;
		double valor2=12;
		
		usuario.soma(valor1, valor2);
		usuario.sub(valor1, valor2);
		usuario.div(valor1, valor2);
		usuario.mult(valor1, valor2);
		
		
		

	}

}
