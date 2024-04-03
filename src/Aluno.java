public class Aluno {
    private int ra;
    private String nome;
    private String cpf;

    public Aluno(int ra, String nome, String cpf){
        this.ra = ra;
        this.nome = nome;
        this.cpf = cpf;

        //this.ra é a variavel glocal, criada no inicio da classe
        //ra_p é a váriavel do parametro do método - sempre do mesmo tipo
    }

    public Aluno(){
        
    }

    public void setRa(int ra_p){
        this.ra = ra_p;
    }

    public int getRa(){
        return this.ra;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setNome(String nome_p){
        this.nome = nome_p;
    }

    public void setCpf(String cpf_p){
        this.cpf = cpf_p;
    }
}
