package estruturais.adapter.teclado;

public class Main {
    public static void main(String[] args) {

        Gabinete gabinete = new Gabinete();

        // Teclado Tipo C não encaixa direto na entrada USB: usa o adapter
        TecladoTipoC tecladoTipoC = new TecladoTipoC();
        AdaptadorCParaUSB adaptador = new AdaptadorCParaUSB(tecladoTipoC);

        gabinete.conectarDispositivo(adaptador);
        gabinete.digitar(adaptador, "A");

        System.out.println("-----");

        // Teclado USB comum conecta direto
        TecladoUSB tecladoUSB = new TecladoUSB();
        gabinete.conectarDispositivo(tecladoUSB);
        gabinete.digitar(tecladoUSB, "B");
    }
}
