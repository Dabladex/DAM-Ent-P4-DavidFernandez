package main.java.liceosorolla;

public class Rectangulo {
	private int lado1 = 0;
	private int lado2 = 0;
	
	public Rectangulo(int lado1, int lado2) {
		
		this.lado1 = lado1;
		this.lado2 = lado2;
		
		
	}
	
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	
	
	public int calculaPerimetro() {
		int perimetro = 0;
		perimetro = lado1 * 2 + lado2 * 2;
		return perimetro; 
	}

	public int calculaArea() {
		int area = 0;
		area= lado1 * lado2;
		return area;
	}
	
	public int calculaDiagonal() {
		int diagonal = 0;
		diagonal = lado1 * lado1 + lado2 * lado2;
		return diagonal;
	}
	
	
	public int calculaCircuncrita() {
		int perimetro = 0;
		int radio = 0;
		
		perimetro = lado1 * lado1 + lado2 * lado2;
		radio = perimetro / 2;
		return radio;
	}
	
}

