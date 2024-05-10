package ProgramaCuentaAtras;

public class ModeloCuentaAtras {

    private int contador;

    public ModeloCuentaAtras(int contadorInicial) {
        this.contador = contadorInicial;
    }

    public int obtenerContador() {
        return contador;
    }

    public void decrementarContador() {
        contador--;
    }
}

