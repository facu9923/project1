package Prueba1;

public class persona {
	
	private String nombre;
	
	private double altura;
	
	private double peso; 
	
	public persona( String nombre, double altura, double peso) {
		
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
		
	}
	
	public double calcularBMI() {
		
		return this.peso / Math.pow(this.altura, 2);
		
	}

}
