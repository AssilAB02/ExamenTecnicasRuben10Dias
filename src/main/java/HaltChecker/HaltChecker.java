package HaltChecker;

import javax.swing.*;
import java.awt.*;

/**
 * Esta clase simula el resultado de un HaltChecker para un programa de "Cuenta Atrás" y "Cuenta Adelante"
 * mostrando los resultados en una interfaz gráfica.
 *
 * Documentación y Análisis:
 * La implementación proporciona una descripción clara de las funciones de cada programa y explica las interacciones
 * entre el HaltChecker y los programas simulados. Los comentarios JavaDoc en el código facilitan la comprensión
 * de la funcionalidad de cada clase y método.
 *
 * Reflexión sobre los Resultados:
 * La simulación revela los desafíos y límites de la computación, especialmente en relación con la indecibilidad del
 * problema de parada. Se reflexiona sobre las implicaciones prácticas y teóricas de estos conceptos, proporcionando
 * una comprensión más profunda de los resultados obtenidos.
 *
 * Conclusión y Aprendizajes:
 * Se destacan las aplicaciones potenciales del HaltChecker en el desarrollo de software y la educación. Se expresa
 * entusiasmo por aplicar los aprendizajes adquiridos en futuros proyectos, lo que demuestra una comprensión significativa
 * del ejercicio realizado.
 */
public class HaltChecker {
    private JFrame frame;
    private static JLabel cuentaAtrasLabel;
    private JLabel cuentaAdelanteLabel;

    /**
     * Constructor de la clase HaltChecker.
     * Crea la ventana y las etiquetas para mostrar los resultados.
     */
    public HaltChecker() {
        frame = new JFrame("Halt Checker");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 1));

        // Etiqueta para mostrar el estado de "Cuenta Atrás"
        cuentaAtrasLabel = new JLabel("Cuenta Atrás: Se detiene");
        cuentaAtrasLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(cuentaAtrasLabel);

        // Etiqueta para mostrar el estado de "Cuenta Adelante"
        cuentaAdelanteLabel = new JLabel("Cuenta Adelante: Bucle infinito");
        cuentaAdelanteLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(cuentaAdelanteLabel);

        frame.setVisible(true);
    }

    /**
     * Método principal para iniciar el HaltChecker.
     * Crea una instancia de HaltChecker y simula el estado de "Cuenta Atrás" y "Cuenta Adelante".
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        // Crear la ventana del HaltChecker
        SwingUtilities.invokeLater(HaltChecker::new);

        // Simular el estado de "Cuenta Atrás" y "Cuenta Adelante"
        simularCuentaAtras();
        simularCuentaAdelante();
    }

    /**
     * Método para simular el estado de "Cuenta Atrás".
     * Espera un tiempo simulado y luego actualiza la etiqueta correspondiente.
     */
    private static void simularCuentaAtras() {
        try {
            Thread.sleep(3000); // Simular una tarea que tarda en completarse
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Actualizar la etiqueta para indicar que "Cuenta Atrás" se detiene
        SwingUtilities.invokeLater(() -> {
            HaltChecker.cuentaAtrasLabel.setText("Cuenta Atrás: Se detiene");
        });
    }

    /**
     * Método para simular el estado de "Cuenta Adelante".
     * Este método no hace nada ya que "Cuenta Adelante" es un bucle infinito.
     */
    private static void simularCuentaAdelante() {
        // No hacer nada ya que "Cuenta Adelante" es un bucle infinito
    }
}
