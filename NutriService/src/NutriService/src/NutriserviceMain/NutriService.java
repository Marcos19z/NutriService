package NutriserviceMain;

import Controlador.controlador;
import Modelo.Look;
import Modelo.modelo;
import Vista.vista;

/**
 * Clase principal que inicia la aplicación NutriService.
 */
public class NutriService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    /**
	     * Método principal para iniciar la aplicación.
	     * @param args Argumentos de la línea de comandos (no utilizado en este caso).
	     */
	        modelo Modelo = new modelo();
	        vista vista = new vista();
	        controlador controlador = new controlador(Modelo, vista);
	        
	        Look.configurar();
	        
	        vista.mostrarVentanaPrincipal();
	    }
	}