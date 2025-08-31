package app;

public class Exibir{
    public static void main(String[] args){

        Cao dalmata = new Cao("Marrom",20,150);

        System.out.println(dalmata.getComprimento());
        System.out.println(dalmata.getCorDoPelo());
        System.out.println(dalmata.getIdadeMax());

        PetShop p1 = new PetShop("1234-5678","Marco","Mel",dalmata);

        System.out.println(p1.getFuncionario());
        System.out.println(p1.getDono());
        System.out.println(p1.getTelefone());

    }
}