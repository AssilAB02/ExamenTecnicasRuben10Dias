package ProgramaCuentaAdelante;

/**
 * Esta clase implementa el modelo de contador adelante.
 */
public class ModeloCuentaAdelante {
    private int contador;

    /**
     * Constructor de la clase ContadorAdelante.
     * @param contadorInicial El número inicial del contador.
     */
    public ModeloCuentaAdelante(int contadorInicial) {
        this.contador = contadorInicial;
    }

    /**
     * Método para obtener el valor actual del contador.
     * @return El valor actual del contador.
     */
    public int obtenerContador() {
        return contador;
    }

    /**
     * Método para incrementar el contador en una unidad.
     */
    public void incrementarContador() {
        contador++;
    }
}
