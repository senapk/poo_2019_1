




class Pessoa{
    String nome;
    void setName(String value){
        if(value.equals("admin"))
            throw new RuntimeException("fail: usuario nao pode ser admin");
    }
}


public class Excessoes {


    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.setName("davi");


        try {
            p.setName("admin");
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Tudo deu certo");
    }



}
