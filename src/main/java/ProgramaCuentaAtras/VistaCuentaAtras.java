package ProgramaCuentaAtras;

import javax.swing.*;

public class VistaCuentaAtras {
    private JFrame frame;
    private JLabel labelCuenta;

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

    public void mostrarCuenta(int numero) {
        labelCuenta.setText(Integer.toString(numero));
    }
}
