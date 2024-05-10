package ProgramaCuentaAtras;

/**
 * Esta clase implementa la aplicación de contador regresivo.
 */
public class CuentaAtrasApp {
    /**
     * Método principal para iniciar la aplicación.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        ModeloCuentaAtras modelo = new ModeloCuentaAtras(0);
        VistaCuentaAtras vista = new VistaCuentaAtras();
        ControladorCuentaAtras controlador = new ControladorCuentaAtras(modelo, vista);
        controlador.iniciarConteo();
    }
}
