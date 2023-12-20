package Controlador;

import Modelo.modelo;
import Vista.vista;

/**
 * Clase que actúa como controlador en el patrón MVC para NutriService.
 */
public class controlador {
    private modelo Modelo;
    private vista Vista;
    
    /**
     * Constructor del controlador.
     * @param modelo El modelo de datos de NutriService.
     * @param vista La interfaz de usuario de NutriService.
     */
    public controlador(modelo Modelo, vista Vista) {
        this.Modelo = Modelo;
        this.Vista = Vista;
       
    }
    
 
}