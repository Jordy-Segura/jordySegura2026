/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.jordysegura2026;

import java.util.Scanner;

/**
 *
 * @author jordy
 */
public class JordySegura2026 {

    public static void main(String[] args) {

        float[] precioProducto;

        precioProducto = new float[5];

        float promedioPrecios = 0;
        float precioAlto = 0;
        float precioBajo = 0;
        int contadorProductos = 0;

        Scanner precios = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el precio del producto " + (i + 1) + ": ");
            float precio = precios.nextFloat();
            precioProducto[i] = precio;
        }
        //precios.nextLine();

        Scanner ingresoMenu = new Scanner(System.in);
        int menu = 0;
        while (menu!=4) {
            System.out.println("");
            System.out.println("\n-----INGRESE UNA OPCION DEL 1-5.-----");
            System.out.println("1.  CALCULAR EL PRECIO PROMEDIO DE LOS PRODUCTOS.");
            System.out.println("2.  MOSTRAR EL PRECIO MÁS ALTO.");
            System.out.println("3.  CONTAR PRODUCTOS POR ENCIMA DEL PROMEDIO.");
            System.out.println("4.  Salir");

            menu = ingresoMenu.nextInt();
            ingresoMenu.nextLine();
            
            //PROMEDIO CASO 1: con el fin de que en el caso 3 ya tenga el promedio porque se necesita
            float suma = 0;

                    for (int i = 0; i < 5; i++) {
                        suma = precioProducto[i] + suma;
                    }
                    promedioPrecios = suma / 5;
                    
            switch (menu) {
                case 1 -> {
                    System.out.println("----CALCULAR EL PRECIO PROMEDIO DE LOS PRODUCTOS----");
                    System.out.println("El promedio de los precios es: " + promedioPrecios);
                }

                case 2 -> {
                    precioAlto = precioProducto[0];
                    precioBajo = precioProducto[0];
                    for (int i = 0; i < 5; i++) {
                        if (precioProducto[i] > precioAlto) {
                            precioAlto = precioProducto[i];
                        }
                        if (precioProducto[i] < precioBajo) {
                            precioBajo = precioProducto[i];
                        }
                    }

                    System.out.println("El precio alto es: " + precioAlto);
                    System.out.println("El precio bajo es: " + precioBajo);
                }

                case 3 -> {
                    contadorProductos=0;
                    for (int i = 0; i < 5; i++) {
                        if (precioProducto[i] > promedioPrecios) {
                            contadorProductos=contadorProductos+1;
                        }
                    }
                    System.out.println("Número de productos por encima del promedio: " + contadorProductos);
                }
                case 4 -> System.out.println("-----PROGRAMA FINALIZADO-----");

                default -> System.out.println("opcion incorrecta");
            }
        }
    }
}
