package com.zubiri.geometria;
public class Cuadrado {

	static final double NUM_PI = 3.1416;

	private double alto = 0;
	private double ancho = 0;
	
	public Cuadrado (double valorancho, double valoralto)
		{
		ancho=valorancho;
		alto=valoralto;
		}


//metodo para calcular el perimetro del cuadrado
	public double perimetro(double valorancho, double valoralto) {

		double resultadoPerimetro;

		resultadoPerimetro = 2* valoralto+ 2* valorancho;
		return resultadoPerimetro;
	}

// Metrodo para calcular erl area del cuadrado
	public double area(double valorancho, double valoralto) {

		double resultadoArea;

		resultadoArea =valoralto*valorancho;

		return resultadoArea;
	}
//definiendo los get y set (como se han usado constructores no habria q usarlos )
/*

	public double getAlto() {

		return alto1;
	}	

	public void setAlto(double alto) {

		alto1 = alto;
	} 

        public double getAncho() {

		return ancho1;
	}	

	public void setAncho(double ancho) {

		ancho1 = ancho;
	} */
}
























