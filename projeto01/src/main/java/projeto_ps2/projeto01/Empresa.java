package projeto_ps2.projeto01;

public class Empresa {
    private String nomeFantasia;
    private String cnpj;
    private String emailContato;
    private String endereco;
    private String descricao;

    public Empresa(){}

    public Empresa(String nomeFantasia, String cnpj, String emailContato, String endereco, String descricao){
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.emailContato = emailContato;
        this.endereco = endereco;
        this.descricao = descricao;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
