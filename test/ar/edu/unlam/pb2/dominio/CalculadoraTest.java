package ar.edu.unlam.pb2.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	// sumar: dados 2 valores, debe devolver la suma de estos
	// restar: dados 2 valores, debe devolver la resta de estos
	// multiplicar: dados 2 valores, debe devolver la multiplicacion de estos
	// dividir: dados 2 valores, debe devolver la division de estos. Si el
	// denominador es cero, debe devolver cero.
	
	private Calculadora calculadora;
	
	@Before
	public void inicializacion() {
		this.calculadora = new Calculadora();
	}

	public void test() {
		// Preparacion: preparamos la informacion para que el test cumpla con el
		// objetivo. Instanciar variables, inicializar objetos.

		// Ejecución: invocación al metodo que estamos probando

		// Validacion: verificamos que lo devuelto por el metodo testeado sea correcto
		// con respecto a lo que debe ser

		// Nota: Test debe dar rojo inicialemente. Luego agregamos el codigo productivo
		// NECESARIO para que el test de verde. Como ultimo -> refactor
	}

	@Test
	public void dadoQueExisteUnaCalculadoraCuandoSumoLosValores3y4EntoncesObtengoComoResultado7() {
		// Preparacion: given - dado que

		// Ejecucion: when - cuando hago algo
		int valorObtenido = this.calculadora.sumar(3, 4);

		// Validacion: then - entonces se cumplen las validacion
		int valorEsperado = 7;
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void dadoQueExisteUnaCalculadoraCuandoSumoLosValores5y5EntoncesObtengoComoResultado10() {
		// Preparacion: given - dado que
		//Calculadora calculadora = new Calculadora();

		// Ejecucion: when - cuando hago algo
		int valorObtenido = this.calculadora.sumar(5, 5);

		// Validacion: then - entonces se cumplen las validacion
		int valorEsperado = 10;
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void dadoQueExisteUnaCalculadoraCuandoDivido10Entre2EntoncesObtengoComoResultado5() {
		// Preparacion: given - dado que
		//Calculadora calculadora = new Calculadora();

		// Ejecucion: when - cuando hago algo
		int valorObtenido = this.calculadora.dividir(10, 2);

		// Validacion: then - entonces se cumplen las validacion
		int valorEsperado = 5;
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void dadoQueExisteUnaCalculadoraCuandoDivido10Entre10EntoncesObtengoComoResultado1() {
		// Preparacion: given - dado que
		//Calculadora calculadora = new Calculadora();

		// Ejecucion: when - cuando hago algo
		int valorObtenido = this.calculadora.dividir(10, 10);

		// Validacion: then - entonces se cumplen las validacion
		int valorEsperado = 1;
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void dadoQueExisteUnaCalculadoraCuandoDivido10Entre0EntoncesObtengoComoResultado0() {
		// Preparacion: given - dado que
		//Calculadora calculadora = new Calculadora();
		int numerador = 10;
		int denominador = 0;

		// Ejecucion: when - cuando hago algo
		int valorObtenido = this.calculadora.dividir(numerador, denominador);

		// Validacion: then - entonces se cumplen las validacion
		int valorEsperado = 0;
		assertEquals(valorEsperado, valorObtenido);
	}
}
