package app;

public class Hello {
    public static void main(String[] args){
        Genero g = new Genero (1, "Aventura");

        Genero g2 = new Genero(2,"");

        System.out.println(g.getNome());
        System.out.println(g.getId());

        System.out.println(g2.getNome());
        System.out.println(g2.getId());

    
    }

}