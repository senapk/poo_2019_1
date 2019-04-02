import java.util.ArrayList;
import java.util.Collections;

public class Album {
    private ArrayList<Figurinha> lista;

    public Album(ArrayList<Figurinha> lista) {
        this.lista = lista;
    }

    public boolean inserirFigurinha(Figurinha figurinha){
        for(Figurinha fig : lista) {
            if (fig.getId() == figurinha.getId()) {
                System.out.println("fail: figurinha repetida");
                return false;
            }
        }
        lista.add(figurinha);
        Collections.sort(lista);
        return true;
    }

    public boolean removerFigurinha(int id){
        for(Figurinha fig : lista) {
            if (fig.getId() == id) {
                lista.remove(fig);
                return true;
            }
        }
        System.out.println("fail: figurinha nao encontrada");
        return false;
    }

    public Figurinha encontrarFigurinha(int id){
        for(Figurinha fig : lista) {
            if (fig.getId() == id) {
                return fig;
            }
        }
        return null;
    }

    public ArrayList<Figurinha> getLista() {
        return lista;
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









