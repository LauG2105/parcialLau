package org.example.ejercicios;

public class CalculaAreaTriangulo3 {
	record Triangulo(double base, double altura) {
    }
	public static void main(String[] args) {
		Triangulo areaTriangulo = new Triangulo( 5D, 4D);
		double valorAreaTriangulo = 0D;
		double base = areaTriangulo.base();
		double altura = areaTriangulo.altura();
		valorAreaTriangulo =  0.5 * base * altura;
		System.out.println("La altura del triángulo es: " + areaTriangulo.altura());
		System.out.println("La base del triángulo es: " + areaTriangulo.base());
		System.out.println("El área del triángulo es: " + valorAreaTriangulo);
	}
}


