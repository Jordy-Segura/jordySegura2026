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
        
        double [] precioProducto;
        
        precioProducto=new double[5];
        
        double promedioPrecios = 0;
        double precioAlto = 0;
        double precioBajo = 0;
        double contadorProductos = 0;
           
        Scanner precios=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {            
            System.out.println("Ingrese el precio del producto "+(i+1)+": ");
            double precio=precios.nextDouble();
            precioProducto[i]=precio;        
        }
        //precios.nextLine();
        
        System.out.println("-----INGRESE UNA OPCION DEL 1-5.-----");
        System.out.println("1.  CALCULAR EL PRECIO PROMEDIO DE LOS PRODUCTOS.");
        System.out.println("2.  MOSTRAR EL PRECIO MÁS ALTO.");
        System.out.println("3.  CONTAR PRODUCTOS POR ENCIMA DEL PROMEDIO.");
        System.out.println("4.  Salir");
        
        Scanner ingresoMenu=new Scanner(System.in);
        int menu=ingresoMenu.nextInt();
        
        ingresoMenu.nextLine();
        switch(menu){
            case 1:
                System.out.println("----CALCULAR EL PRECIO PROMEDIO DE LOS PRODUCTOS----");
                double suma =0;
                
                for (int i = 0; i < 5; i++) {
                    suma=precioProducto[i]+suma;
                }
                promedioPrecios=suma/5;
                
                System.out.println("El promedio de los precios es: "+promedioPrecios);
                break;
                
            case 2:
                precioAlto = precioProducto[0];
                precioBajo = precioProducto[0];
                
                
                break;
                
            case 3:

                break;
            case 4:

                break;
            
            default:
                System.out.println("opcion incorrecta");
        }
    }
}
