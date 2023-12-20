package Modelo;

/**
 * Clase para gestionar la configuración estética de NutriService.
 */
public class Look {
    private static String nombrePrograma = "NutriService";
    private static String tituloVentanaPrincipal = "NutriService - Ventana Principal";

    /**
     * Configura la apariencia de NutriService.
     */
    public static void configurar() {
        // Configurar aspectos estéticos, colores, etc.
    }

    /**
     * Obtiene el nombre del programa.
     * @return El nombre del programa.
     */
    public static String getNombrePrograma() {
        return nombrePrograma;
    }

    /**
     * Obtiene el título de la ventana principal.
     * @return El título de la ventana principal.
     */
    public static String getTituloVentanaPrincipal() {
        return tituloVentanaPrincipal;
    }
}