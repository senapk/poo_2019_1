import java.util.ArrayList;

public class GeradorAlbumFutebol{

    static Album gerar(){
        Album referencia = new Album(new ArrayList<Figurinha>());
        referencia.inserirFigurinha(new Figurinha(11, "JQx"));
        referencia.inserirFigurinha(new Figurinha(1, "Bajio"));
        referencia.inserirFigurinha(new Figurinha(2, "Peleh"));
        referencia.inserirFigurinha(new Figurinha(3, "Maradonah"));
        referencia.inserirFigurinha(new Figurinha(4, "Ronaldo"));
        referencia.inserirFigurinha(new Figurinha(5, "PauloBaia"));
        referencia.inserirFigurinha(new Figurinha(6, "Quaqua"));
        referencia.inserirFigurinha(new Figurinha(7, "Neimah"));
        referencia.inserirFigurinha(new Figurinha(8, "Ruqui"));
        referencia.inserirFigurinha(new Figurinha(9, "MalgoAlves"));
        referencia.inserirFigurinha(new Figurinha(10, "Meçi"));
        return referencia;
    }
}
