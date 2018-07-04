package com.bryanalexandercd.novedades;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class GestorArchivo {

	public String ventanaEleccion(boolean tipo) {

		JFileChooser chooser = new JFileChooser();

		int res;

		if (tipo) {

			res = chooser.showSaveDialog(null);

		} else {
			res = chooser.showOpenDialog(null);
		}

		String ruta = "";

		if (res == JFileChooser.APPROVE_OPTION) {

			ruta = chooser.getSelectedFile().getAbsolutePath();

		}

		return ruta;

	}

	public ArrayList<Integer> leer(String ruta) {

		ArrayList<Integer> enteros = new ArrayList<>();

		int res = 0;

		try {

			FileInputStream fileInputStream = new FileInputStream(ruta);

			while (res != -1) {

				res = fileInputStream.read();

				enteros.add(res);
			}

			fileInputStream.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}

		for (int n : enteros) {

			System.out.println(n);

		}

		System.out.println("TAMAÑO: " + enteros.size());

		return enteros;

	}

	public void escribir(ArrayList<Integer> enteros) {

		try {

			FileOutputStream fileOutputStream = new FileOutputStream(ventanaEleccion(true));

			for (int ent : enteros) {

				fileOutputStream.write(ent);

			}

			fileOutputStream.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
