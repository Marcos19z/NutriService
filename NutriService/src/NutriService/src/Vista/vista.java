package Vista;

import java.awt.BorderLayout;

import javax.swing.*;

import Modelo.Look;

/**
 * Clase que gestiona la interfaz de usuario de NutriService.
 */
public class vista {
    private JFrame ventanaPrincipal;
    
    /**
     * Muestra la ventana principal de NutriService.
     */
    public void mostrarVentanaPrincipal() {
        ventanaPrincipal = new JFrame();
        ventanaPrincipal.setTitle(Look.getTituloVentanaPrincipal());
        
        JLabel labelCabecera = new JLabel(Look.getNombrePrograma());
        // Configurar el JLabel en la cabecera
        
        ventanaPrincipal.add(labelCabecera, BorderLayout.NORTH);
        ventanaPrincipal.pack();
        ventanaPrincipal.setVisible(true);
        
        // Simular una carga de unos segundos
        // Luego, ocultar la ventana de carga y mostrar la interfaz principal
    }
}