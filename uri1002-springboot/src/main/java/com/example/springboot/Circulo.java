/**
 *  Direitos autorais, 2021, Gabriel Menin.
 */
package com.example.springboot;

/**
 * 
 * A classe <code>Circulo</code> representa um c?rculo com raio.
 * 
 * @author Gabriel
 *
 *
 */
public class Circulo {
	
	private double raio;
	private static final double PI = 3.14159;

	/**
	 * Cria um c?rculo com raio <code>raio</code>.
	 * 
	 * @param raio o raio do novo c?rculo
	 * @throws IllegalArgumentException
	 * 			Quando o valor do raio ? menor ou igual a zero.
	 */
	public Circulo(double raio) {
		super();
		if(raio <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	/**
	 * @return
	 */
	
	public double getArea() {
		// TODO Auto-generated method stub
		return raio * raio * PI;
	}

}
