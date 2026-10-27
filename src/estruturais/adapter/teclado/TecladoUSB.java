package estruturais.adapter.teclado;

// Dispositivo que já é compatível com a entrada USB (não precisa de adapter)
public class TecladoUSB implements DispositivoUSB {
    @Override
    public void conectarUSB() {
        System.out.println("Teclado USB conectado diretamente na entrada USB");
    }

    @Override
    public void enviarTecla(String tecla) {
        System.out.println("Sinal USB enviado: " + tecla);
    }
}
