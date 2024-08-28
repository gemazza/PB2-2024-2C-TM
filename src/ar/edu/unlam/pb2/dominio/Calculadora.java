package ar.edu.unlam.pb2.dominio;

public class Calculadora {

	public int sumar(int valorUno, int valorDos) {
		return valorUno + valorDos;
	}

	public int dividir(int numerador, int denominador) {
		int resultado = 0;
		
		if (denominador != 0) {
			resultado = numerador / denominador;
		}

		return resultado;
	}

}
