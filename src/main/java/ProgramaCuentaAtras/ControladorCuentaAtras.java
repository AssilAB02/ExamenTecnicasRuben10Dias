package ProgramaCuentaAtras;

/**
 * Esta clase implementa el controlador de la aplicación de contador regresivo.
 */
public class ControladorCuentaAtras {
    private ModeloCuentaAtras modelo;
    private VistaCuentaAtras vista;

    /**
     * Constructor de la clase ControladorCuentaAtras.
     * @param modelo El modelo de contador.
     * @param vista La vista de contador.
     */
    public ControladorCuentaAtras(ModeloCuentaAtras modelo, VistaCuentaAtras vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    /**
     * Método para iniciar el conteo regresivo.
     * Inicia un nuevo hilo para ejecutar el conteo regresivo y actualiza la vista en consecuencia.
     */
    public void iniciarConteo() {
        int numeroInicial = 10; // Número inicial predeterminado
        modelo = new ModeloCuentaAtras(numeroInicial);

        new Thread(() -> {
            while (modelo.obtenerContador() >= 0) {
                vista.mostrarCuenta(modelo.obtenerContador());
                modelo.decrementarContador();
                esperarSegundo();
            }
        }).start();
    }

    /**
     * Método para esperar un segundo.
     * Se utiliza para pausar el hilo durante un segundo entre cada conteo.
     */
    private void esperarSegundo() {
        try {
            Thread.sleep(1000); // Esperar 1 segundo (1000 milisegundos)
        } catch (InterruptedException e) {
            System.err.println("Error al esperar.");
            Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
        }
    }
}
