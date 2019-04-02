import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) {
        Album referencia = GeradorAlbumFutebol.gerar();

        Pacote pacotinho = new Pacote();
        Album novinho = new Album(new ArrayList<Figurinha>());
        System.out.println("completo\n" + referencia);
        pacotinho.gerarAleatoriamente(5, referencia);
        System.out.println("pacotinho\n" + pacotinho);
        pacotinho.preencherAlbum(novinho);
        System.out.println("pacotinho\n" + pacotinho);
        System.out.println("novinho\n" + novinho);

    }


}
