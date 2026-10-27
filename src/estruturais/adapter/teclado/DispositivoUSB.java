package estruturais.adapter.teclado;

// Interface alvo (Target): o que o gabinete espera receber
public interface DispositivoUSB {
    void conectarUSB();
    void enviarTecla(String tecla);
}
