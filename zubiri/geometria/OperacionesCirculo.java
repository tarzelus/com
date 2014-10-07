//para agrupar en el paquete y poder usar las clases de este fichero en "operacionesGeometricas"
package com.zubiri.geometria;
import java.util.Scanner;
// para importar el resultado del fichero circulo en caso de que este en tro directorio




public class OperacionesCirculo {

	public static void main () {


		double radio, resultadoDiametro, resultadoArea;
		Circulo circulo = new Circulo();

		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa la radio de la circunferencia en cm: ");
		radio = sc.nextInt();
		
		circulo.setRadio(radio);


		resultadoDiametro = circulo.circun();
		resultadoArea = circulo.area();

		System.out.println("\nEl del diametro de la circunferencia es: " + resultadoDiametro +"cm");
		System.out.println("\nEl área de la circunferencia es: " + resultadoArea + "cm²");
	
		System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
