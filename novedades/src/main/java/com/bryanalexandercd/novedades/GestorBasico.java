package com.bryanalexandercd.novedades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class GestorBasico {

	public String origen() {

		JFileChooser chooser = new JFileChooser();

		chooser.showDialog(null, "Dale Click!");

		File archivo = chooser.getSelectedFile();

		System.out.println(archivo.getAbsoluteFile().getAbsolutePath());

		// int resultado = chooser.showOpenDialog(null);

		// chooser.showSaveDialog(null);

		System.out.println("ELEGISTE");

		return archivo.getAbsoluteFile().getAbsolutePath();
	}

	public String leer(String ruta) {

		String texto = "";

		try {

			FileReader fileReader = new FileReader(ruta);

			int caracter = 0;

			do {

				caracter = fileReader.read();

				texto += (char) caracter;

			} while (caracter != -1);

			fileReader.close();

			// System.out.println(texto);

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

		return texto;
	}

	public void escribir(String contenido) {

		try {

			FileWriter fileWriter = new FileWriter("C:\\Users\\bcondor\\Personal\\Stream\\test2.txt");

			fileWriter.write(contenido);

			fileWriter.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
