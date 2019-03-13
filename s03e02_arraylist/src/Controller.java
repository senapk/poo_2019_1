import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("Michael Jackson");
        nomes.add("Whitney Houston");
        nomes.add("Amy Winehouse");
        nomes.add("Renato Russo");
        nomes.add("Elvis Presley");

        for(String elem : nomes)
            System.out.print(elem + "; ");
        System.out.println("");

        nomes.add(0, "Leandro");

        for(String elem : nomes)
            System.out.print(elem + "; ");
        System.out.println("");

        System.out.println(nomes.get(3));

        nomes.remove(2);
        for(String elem : nomes)
            System.out.print(elem + "; ");
        System.out.println("");

        int pos = nomes.indexOf("Renato Russo");
        System.out.println(pos);


        for(int i = 0; i < nomes.size(); i += 1){
            System.out.print(nomes.get(i) + ",");
        }
        System.out.println("");

        nomes.remove(4);
        for(String elem : nomes)
            System.out.print(elem + "; ");
        System.out.println("");
    }
}











