package ProgramaCuentaAtras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCuentaAtras {
    private ModeloCuentaAtras modelo;
    private VistaCuentaAtras vista;

    public ControladorCuentaAtras(ModeloCuentaAtras modelo, VistaCuentaAtras vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.agregarIniciarListener(new IniciarListener());
    }

    private class IniciarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            vista.mostrarInicio(modelo.obtenerContador());
            int numeroInicial = vista.obtenerNumeroInicial();
            modelo = new ModeloCuentaAtras(numeroInicial);

            new Thread(() -> {
                while (modelo.obtenerContador() >= 0) {
                    vista.mostrarCuenta(modelo.obtenerContador());
                    modelo.decrementarContador();
                    esperarSegundo();
                }
                vista.mostrarFin();
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
}
