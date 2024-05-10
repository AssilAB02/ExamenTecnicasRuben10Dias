package ProgramaCuentaAtras;

public class ControladorCuentaAtras {
    private ModeloCuentaAtras modelo;
    private VistaCuentaAtras vista;

    public ControladorCuentaAtras(ModeloCuentaAtras modelo, VistaCuentaAtras vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

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

    private void esperarSegundo() {
        try {
            Thread.sleep(1000); // Esperar 1 segundo (1000 milisegundos)
        } catch (InterruptedException e) {
            System.err.println("Error al esperar.");
            Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
        }
    }
}
