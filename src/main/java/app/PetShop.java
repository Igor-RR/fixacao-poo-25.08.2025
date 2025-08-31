package app;

class PetShop{
    private Cao cao;
    private String funcionario;
    private String dono;
    private String telefone;

    public Cao getCao(){
        return cao;
    }
    public String getFuncionario(){
        return funcionario;
    }
    public String getDono(){
        return dono;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setFuncionario(String funcionario){
        this.funcionario = funcionario;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setCao(Cao cao){
        this.cao = cao;
    }

    public PetShop(){};

    public PetShop(String telefone, String funcionario, String dono, Cao cao){
        this.setFuncionario(funcionario);
        this.setDono(dono);
        this.setTelefone(telefone);
        this.setCao(cao);
    }
}
