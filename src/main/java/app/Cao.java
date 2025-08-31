package app;

public class Cao{
    private String corDoPelo;
    private int idadeMax;
    private int comprimento;

    public void setCorDoPelo(String corDoPelo){
        this.corDoPelo = corDoPelo;
    }
    public String getCorDoPelo(){
        return corDoPelo;
    }
    public void setIdadeMax(int idadeMax){
        this.idadeMax = idadeMax;
    }
    public int getIdadeMax(){
        return idadeMax;
    }
    public void setComprimento(int comprimento){
        this.comprimento = comprimento;
    }
    public int getComprimento(){
        return comprimento;
    }

    public Cao(){};

    public Cao(String corDoPelo, int idadeMax, int comprimento){
        this.setCorDoPelo(corDoPelo);
        this.setComprimento(comprimento);
        this.setIdadeMax(idadeMax);
    }
}