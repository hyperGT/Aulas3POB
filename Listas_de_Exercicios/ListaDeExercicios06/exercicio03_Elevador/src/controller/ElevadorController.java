import domain.Elevador;

public class ElevadorController {
    
    public static void main(String[] args) {
    
        Elevador elevador = new Elevador(2, 12);

        elevador.subir(13);
        
        elevador.exibirAndar();
    }
}
