//para agrupar en el paquete y poder usar las clases de este fichero en "operacionesGeometricas"
package com.zubiri.geometria;

/*
 * clase para calcular la circunferencia y el area del circulo
 */

public class Circulo {

double radio1=0;
double result;
 //Método para calcular la circunferencia del circulo
 public double circun () {

	double result = 0;
	result = 6.283185307179586476925286766559 * getRadio();
	return result;
 }



 //Método para calcular el area del circulo mediante getRadio
 public double area () {

	double result = 0;
	result = 3.1415926535897932384626433832795 * getRadio()* getRadio();
	return result;
 }

//declaracion de los get y set
private double getRadio(){
	return radio1;
}
public void  setRadio(double radio){

radio1=radio;
}

}

