package ProgramaCuentaAtras;

import javax.swing.*;

/**
 * Esta clase implementa la vista de la aplicación de contador regresivo.
 */
public class VistaCuentaAtras {
    private JFrame frame;
    private JLabel labelCuenta;

    /**
     * Constructor de la clase VistaCuentaAtras.
     * Crea y muestra la ventana de la aplicación.
     */
    public VistaCuentaAtras() {
        frame = new JFrame("Contador Regresivo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        labelCuenta = new JLabel();
        labelCuenta.setBounds(20, 50, 250, 20);
        frame.add(labelCuenta);

        frame.setVisible(true);
    }

    /**
     * Método para mostrar el número actual del contador en la vista.
     * @param numero El número a mostrar en la vista.
     */
    public void mostrarCuenta(int numero) {
        labelCuenta.setText(Integer.toString(numero));
    }
}
