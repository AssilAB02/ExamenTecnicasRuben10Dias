package ProgramaCuentaAtras;

import javax.swing.*;
import java.awt.event.ActionListener;

public class VistaCuentaAtras {
    private JFrame frame;
    private JLabel labelInicio;
    private JLabel labelCuenta;
    private JLabel labelFin;
    private JTextField textFieldNumeroInicial;

    public VistaCuentaAtras() {
        frame = new JFrame("Contador Regresivo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        labelInicio = new JLabel("Comenzando el conteo regresivo");
        labelInicio.setBounds(20, 20, 250, 20);
        frame.add(labelInicio);

        labelCuenta = new JLabel();
        labelCuenta.setBounds(20, 50, 250, 20);
        frame.add(labelCuenta);

        labelFin = new JLabel();
        labelFin.setBounds(20, 80, 250, 20);
        frame.add(labelFin);

        textFieldNumeroInicial = new JTextField();
        textFieldNumeroInicial.setBounds(20, 120, 100, 20);
        frame.add(textFieldNumeroInicial);

        JButton buttonIniciar = new JButton("Iniciar");
        buttonIniciar.setBounds(150, 120, 100, 20);
        frame.add(buttonIniciar);

        frame.setVisible(true);
    }

    public int obtenerNumeroInicial() {
        return Integer.parseInt(textFieldNumeroInicial.getText());
    }

    public void mostrarInicio(int numeroInicial) {
        labelInicio.setText("Comenzando el conteo regresivo desde " + numeroInicial);
    }

    public void mostrarCuenta(int numero) {
        labelCuenta.setText(Integer.toString(numero));
    }

    public void mostrarFin() {
        labelFin.setText("¡Tiempo agotado! ¡Fin del conteo regresivo!");
    }

    public void cerrar() {
        frame.dispose();
    }

    public void agregarIniciarListener(ActionListener listener) {
        textFieldNumeroInicial.addActionListener(listener);
    }
}
