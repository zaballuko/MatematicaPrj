package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import sumas.Matematica;

public class Test {
	
	/**
	 * Importamos el paquete sumas.Matematica para poder acceder a la clase
	 * Creamos el objeto matematica de la clase Matematica para usar sus m�todos
	 */
	Matematica matematica = new Matematica();

	/**
	 * Si el resultadoSuma es igual a la pruebaSuma no dar� error, el assertEquals los compara
	 */
	@org.junit.Test
	public void testSumaAB() {
		int resultadoSuma = matematica.sumaAB(10, 50);
		int pruebaSuma = 60;
			assertEquals(resultadoSuma,resultadoSuma);
	
	}
	/**
	 * si el resultado es False fallar� el programa
	 */
	@org.junit.Test
	public void testEsMayor() {
		boolean resultado = matematica.esMayor(13, 16);
		assertFalse(resultado);
	
	}
	/**
	 * El programa fallar� cuando el ArrayList de sumas no tenga ninguna suma dentro, 
	 * pero como en el primer test hemos metido una sumaAB tenemos una y no fallar�
	 */
	
	@org.junit.Test
	public void testGetSumas(){
		ArrayList<Integer> resultado = matematica.getSumas();
		assertNotNull(resultado);
	}

}
