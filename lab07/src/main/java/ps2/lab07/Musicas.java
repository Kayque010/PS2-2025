package ps2.lab07;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Scanner;

@Entity
public class Musicas {
    
    @Id @GeneratedValue
    private Long id;
    private String titulo;
    private String compositor;
    private int ano;
    
    public Musicas(){}

    public Musicas(String t, String c, int a){
        this.titulo = t;
        this.compositor = c;
        this.ano = a;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setCompositor(String compositor){
        this.compositor = compositor;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getCompositor(){
        return compositor;
    }

    public int getAno(){
        return ano;
    }
}
