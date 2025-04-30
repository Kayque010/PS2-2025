package ps2.teoria08;
import java.util.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {
    private List<Professor> professores;
    public ProfessorController(){
        professores = new ArrayList();
        professores.add(new Professor(1,"Fulano",1234));
        professores.add(new Professor(2,"Ciclano",567));
        professores.add(new Professor(3,"Beltrano",8910));
    }
}