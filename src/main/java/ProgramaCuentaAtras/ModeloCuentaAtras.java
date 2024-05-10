package ProgramaCuentaAtras;

/**
 * Esta clase implementa el modelo de contador regresivo.
 */
public class ModeloCuentaAtras {
    private int contador;

    /**
     * Constructor de la clase Contador.
     * @param contadorInicial El número inicial del contador.
     */
    public ModeloCuentaAtras(int contadorInicial) {
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
     * Método para decrementar el contador en una unidad.
     */
    public void decrementarContador() {
        contador--;
    }
}
