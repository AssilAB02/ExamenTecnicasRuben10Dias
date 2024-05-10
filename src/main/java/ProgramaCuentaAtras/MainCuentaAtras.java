package ProgramaCuentaAtras;



public class MainCuentaAtras {
    public static void main(String[] args) {
        ModeloCuentaAtras modelo = new ModeloCuentaAtras(0);
        VistaCuentaAtras vista = new VistaCuentaAtras();
        ControladorCuentaAtras controlador = new ControladorCuentaAtras(modelo, vista);
        controlador.iniciarConteo();
    }
}
