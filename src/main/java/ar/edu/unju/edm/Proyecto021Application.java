package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controler.CalculadoraControler;

@SpringBootApplication
public class Proyecto021Application {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto021Application.class, args);
		CalculadoraControler nuevoControlador = new CalculadoraControler();
		nuevoControlador.resolverSuma();
	}

}
