import java.util.ArrayList;






class Pet{
    boolean alive = true;

    void miar(){
        if(!alive)
            throw new RuntimeException("gato morreu");
        System.out.println("Miau");
    }
}



class Teste{
    public static void outroMetodo(){
        try{
            Pet pet = new Pet();
            pet.alive = false;
            pet.miar();
            String str = null;
            str.equals("amor");
        }catch(Exception e){
            System.out.println("deu erro");
        }
        System.out.println("Vamos comer pizza");
    }

    public static void main(String args[]){
        try {
            outroMetodo();
        }catch(ArithmeticException e){
            System.out.println("Aconteceu um pobrema de conta");
        }catch(NullPointerException e){
            System.out.println("Aconteceu um pobrema nulo");
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Hoje eh um dia lindo");
    }
}
