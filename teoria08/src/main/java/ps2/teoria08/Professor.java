package ps2.teoria08;

public class Professor{
    private long id;
    private String nome;
    private int matricula;

    public Professor(){}

    public Professor(long id, String nome, int matricula){
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
}

