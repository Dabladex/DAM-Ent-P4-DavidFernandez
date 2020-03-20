package src.main.java.liceosorolla;

public class Animal {
	
	private String especie;
	private String raza;
	private double peso;
	private int edad;
	private String pelo;
	
	public Animal(String especie, String raza, double peso, int edad, String pelo) {
		this.especie = especie;
		this.raza = raza;
		this.peso = peso;
		this.edad = edad;
		this.pelo = pelo;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	
	

}
