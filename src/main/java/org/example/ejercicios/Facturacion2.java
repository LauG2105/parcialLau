package org.example.ejercicios;

import java.time.LocalDate;
import java.util.List;
public class Facturacion2 {
	public record Factura(String cliente, LocalDate fechaFactura, List<Double> precioProducto) {
	}
	public static void main(String[] args) {
		Factura factura1 = new Factura("Maria Sannabria", LocalDate.of(1999,7,1), List.of(4500D, 5000D, 2500D));
		Factura factura2 = new Factura("Juan Pérez", LocalDate.of(2000,8,15), List.of(3500D, 6000D, 2800D));
		double totalValorFactura1 = 0;
		for (Double precio : factura1.precioProducto) {
			totalValorFactura1 += precio;
		}
		double totalValorFactura2 = 0;
		for (Double precio : factura2.precioProducto) {
			totalValorFactura2 += precio;
		}
		System.out.println("Factura No.1" );
		System.out.println("Cliente: " + factura1.cliente());
		System.out.println("Total: " + totalValorFactura1);

		System.out.println("Factura No.2" );
		System.out.println("Cliente: " + factura2.cliente());
		System.out.println("Total: " + totalValorFactura2);
	}

}
