package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

                List<String> listaAemet1 = new ArrayList<>();
                List<String> listaAemet2 = new ArrayList<>();
                List<String> listaAemet3 = new ArrayList<>();

                try (BufferedReader br = new BufferedReader(new FileReader("data/Aemet20171029.csv"))) {
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        listaAemet1.add(linea);
                    }
                } catch (IOException exception) {
                    System.out.println("No se ha encontrado ningún archivo en esta ruta o ha ocurrido un error al leer el archivo.");
                }

                // Ahora tienes cada línea del archivo JSON en la lista listaPokemon
                for (String jsonLine : listaAemet1) {
                    System.out.println(jsonLine);
                }

                try (BufferedReader br = new BufferedReader(new FileReader("data/Aemet20171030.csv"))) {
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        listaAemet2.add(linea);
                    }
                } catch (IOException exception) {
                    System.out.println("No se ha encontrado ningún archivo en esta ruta o ha ocurrido un error al leer el archivo.");
                }

                // Ahora tienes cada línea del archivo JSON en la lista listaPokemon
                for (String jsonLine : listaAemet2) {
                    System.out.println(jsonLine);
                }

                try (BufferedReader br = new BufferedReader(new FileReader("data/Aemet20171031.csv"))) {
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        listaAemet3.add(linea);
                    }
                } catch (IOException exception) {
                    System.out.println("No se ha encontrado ningún archivo en esta ruta o ha ocurrido un error al leer el archivo.");
                }

                // Ahora tienes cada línea del archivo JSON en la lista listaPokemon
                for (String jsonLine : listaAemet3) {
                    System.out.println(jsonLine);
                }
    }
}