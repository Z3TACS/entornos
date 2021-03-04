package EntornosDesarrollo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		
		//invocar a mi clase calculadora
		
		//Llamo a la clase del objeto c, invoco el método constructor de la clase calculadora en este caso calculadora también
		Calculadora c = new Calculadora(20,50);
		
		int valorEsperado = 70;
		int valorReal =  c.suma();
		int delta = 0;
		
		assertEquals(valorEsperado, valorReal, delta);

	}
	@Test
	void testResta() {
		
		Calculadora c = new Calculadora(20,50);
		
		int valorEsperado = -30;
		int valorReal = c.resta();
		int delta = 0;
		
		assertEquals(valorEsperado, valorReal, delta);
		
	}
	
	@Test
	void testMultiplicar() {
		
		Calculadora c = new Calculadora(20,50);
		
		int valorEsperado = 1000 ;
		int valorReal = c.multiplicar();
		int delta = 0;
		
		assertEquals(valorEsperado, valorReal, delta);
		
	}
	
	@Test
	void testDivision() {
		
		Calculadora c = new Calculadora(20,50);
		
		int valorEsperado = 20/50;
		int valorReal = c.division();
		int delta = 0;
		
		assertEquals(valorEsperado, valorReal, delta);
		
	}



}
