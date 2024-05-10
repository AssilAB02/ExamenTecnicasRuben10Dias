package ProgramaCuentaAdelante;

/**
 * Esta clase implementa el controlador de la aplicación de contador adelante.
 */
public class ControladorCuentaAdelante {
    private ModeloCuentaAdelante modelo;
    private VistaCuentaAdelante vista;

    /**
     * Constructor de la clase ControladorCuentaAdelante.
     * @param modelo El modelo de contador adelante.
     * @param vista La vista de contador adelante.
     */
    public ControladorCuentaAdelante(ModeloCuentaAdelante modelo, VistaCuentaAdelante vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    /**
     * Método para iniciar el conteo adelante.
     * Inicia un nuevo hilo para ejecutar el conteo y actualiza la vista en consecuencia.
     */
    public void iniciarConteo() {
        int numeroInicial = 0; // Número inicial predeterminado
        modelo = new ModeloCuentaAdelante(numeroInicial);

        new Thread(() -> {
            while (true) {
                vista.mostrarCuenta(modelo.obtenerContador());
                modelo.incrementarContador();
                esperarSegundo();
            }
        }).start();
    }

    /**
     * Método para esperar un segundo.
     * Se utiliza para pausar el hilo durante un segundo entre cada incremento del contador.
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
