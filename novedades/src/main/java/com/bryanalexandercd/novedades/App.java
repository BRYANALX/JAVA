package com.bryanalexandercd.novedades;

public class App {

	public static void main(String[] args) {

		// escribir(leer(origen()));

		GestorArchivo archivo = new GestorArchivo();

		archivo.escribir(archivo.leer(archivo.ventanaEleccion(false)));

	}

}
