package ProgramaCuentaAdelante;

/**
 * Esta clase implementa la aplicación de contador adelante.
 */
public class MainCuentaAdelante {
    /**
     * Método principal para iniciar la aplicación.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        ModeloCuentaAdelante modelo = new ModeloCuentaAdelante(0);
        VistaCuentaAdelante vista = new VistaCuentaAdelante();
        ControladorCuentaAdelante controlador = new ControladorCuentaAdelante(modelo, vista);
        controlador.iniciarConteo();
    }
}
