package estruturais.adapter.teclado;

// Adaptee: classe existente com interface incompatível (saída USB-C)
public class TecladoTipoC {
    public void conectarTipoC() {
        System.out.println("Teclado conectado pela saida Tipo C");
    }

    public void enviarSinalTipoC(String tecla) {
        System.out.println("Sinal Tipo C enviado: " + tecla);
    }
}
