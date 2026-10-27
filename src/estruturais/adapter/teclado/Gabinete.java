package estruturais.adapter.teclado;

// Client: só conhece a entrada USB
public class Gabinete {

    public void conectarDispositivo(DispositivoUSB dispositivo) {
        dispositivo.conectarUSB();
    }

    public void digitar(DispositivoUSB dispositivo, String tecla) {
        dispositivo.enviarTecla(tecla);
    }
}
