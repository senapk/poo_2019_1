import java.util.ArrayList;
import java.util.Random;

public class Pacote {
    ArrayList<Figurinha> lista;

    public Pacote() {
        this.lista = new ArrayList<Figurinha>();
    }

    public void preencherAlbum(Album album){
        for(int i = lista.size() - 1; i > -1; i -= 1){
            Figurinha fig = lista.get(i);
            if(album.encontrarFigurinha(fig.getId()) == null){
                album.inserirFigurinha(fig);
                lista.remove(i);
            }
        }
    }

    void gerarAleatoriamente(int qtd, Album album){
        Random random = new Random();
        for(int i = 0; i < qtd; i++){
            int num = random.nextInt(album.getLista().size());
            lista.add(album.getLista().get(num));
        }
    }

    @Override
    public String toString() {
        String saida = "{ ";
        for(Figurinha fig : this.lista){
            saida += fig + " ";
        }
        return saida + "}";
    }
}
