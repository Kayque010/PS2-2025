package ps2.teoria09;
public class Padaria {

    private String nome;
    private String endereco;
    private long id;

    public Padaria(){};

    public Padaria(String nome, String endereco, long id){
        this.nome = nome;
        this.endereco = endereco;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}
