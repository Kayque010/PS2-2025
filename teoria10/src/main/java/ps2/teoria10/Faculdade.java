package ps2.teoria10;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Faculdade {
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private String cidade;
    private String estado;
    private int anoFundacao;

}
