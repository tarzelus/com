//para agrupar en el paquete y poder usar las clases de este fichero en "operacionesGeometricas"
package com.zubiri.geometria;
import java.util.Scanner;
// para importar el resultado del fichero circulo en caso de que este en tro directorio



public class OperacionesCuadrado {

	public static void main () {
	
	  double ancho;
          double alto;
	  double result;
	  double perimetro;	  
	  double area;
	  Cuadrado cuadrado = new Cuadrado();

	  Scanner sc = new Scanner(System.in);
          System.out.print("\ningresa la altura: ");
          alto = sc.nextDouble();
	  System.out.print("\ningresa la anchura: ");
	  ancho = sc.nextDouble();
	  
	  cuadrado.setAlto(alto);
	  cuadrado.setAncho(ancho);

	
	  perimetro =  cuadrado.perimetro();
	  System.out.println("La perimetro es: " + perimetro); 
			
	  area =  cuadrado.area();
	  System.out.println("El area es: " + area); 
	}

}