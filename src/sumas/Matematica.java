package sumas;

import java.util.ArrayList;

/**
 * @author David Zabal
 * @version 2.0 16/03/2018
 *
 */
public class Matematica {

	/**
	 * Devuelve la suma de a y b de tipo int e inserta el resultado sumaAB en una private ArrayList de sumas
	 * @param a tipo int
	 * @param b tipo int
	 * @return sumaAB tipo int
	 */
	private ArrayList<Integer> sumas = new ArrayList<Integer>();
	
	public int sumaAB(int a,int b){
		
		int sumaAB = a + b;
		
		sumas.add(sumaAB);
		
		return sumaAB;
	}
	
	/**
	 * Compara las dos variables de tipo int y si a es mayor que b devolverá true y false cuando es menor o igual
	 * @param a de tipo int
	 * @param b de tipo int
	 * @return true o false tipo boolean
	 */

	public boolean esMayor(int a, int b) {

		if (a > b) {
			return true;
		} else if (a < b) {
			return false;
		} else {
			return false;
		}
	}
	
	
	
	/**Devuelve el ArrayList de sumas
	 * @return ArrayList de tipoo Integer con los resultados de sumaAB
	 */
	public ArrayList<Integer> getSumas(){
		
		return this.sumas;
	}
	

}

