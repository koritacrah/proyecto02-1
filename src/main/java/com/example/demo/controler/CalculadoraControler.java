package com.example.demo.controler;
import com.example.demo.model.*;

public class CalculadoraControler {
	public void resolverSuma() {
		float a;
		float b;
		a=10;
		b=5;

		Calculadora nuevaCalculadora= new Calculadora ();
		nuevaCalculadora.setA(a);
		nuevaCalculadora.setB(b);

		System.out.println("El resultado de la suma es:" + nuevaCalculadora.sumarDosNumeros());
		System.out.println("el resultado de la division es :" + nuevaCalculadora.dividirDosNumeros());

	}
}
