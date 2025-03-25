package aula06.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Titular {
    @Id
    private long id;
    private String nome;
    private String cpf;

    public Titular(){}
    
    public Titular(long id, String n, String c) {
        this.id = id;
        nome = n;
        cpf = c;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public void setCpf(String c){
        this.cpf = c;
    }

    public long getId(){
        return id;
    }    

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }
}
