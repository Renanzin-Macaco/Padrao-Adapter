package estruturais.adapter.teclado;

// Adapter: traduz as chamadas USB do gabinete para o teclado Tipo C
public class AdaptadorCParaUSB implements DispositivoUSB {
    private TecladoTipoC tecladoTipoC;

    public AdaptadorCParaUSB(TecladoTipoC tecladoTipoC) {
        this.tecladoTipoC = tecladoTipoC;
    }

    @Override
    public void conectarUSB() {
        System.out.println("Adaptador convertendo Tipo C -> USB...");
        tecladoTipoC.conectarTipoC();
    }

    @Override
    public void enviarTecla(String tecla) {
        tecladoTipoC.enviarSinalTipoC(tecla);
    }
}
