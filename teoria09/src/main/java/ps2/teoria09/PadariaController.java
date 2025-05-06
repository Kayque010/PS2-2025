package ps2.teoria09;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PadariaController {

    private List<Padaria> padarias;

    public PadariaController(){
        padarias = new ArrayList<>();
        padarias.add(new Padaria("Primavera","Rua Primavera"));

    }


    @GetMapping("/api/padarias/check")
    public String verificar(){
        return "Padaria Controller";
    }

    @GetMapping("/api/padarias")
    public List<Padaria> getPadarias(){
        return this.padarias;
    }

    @GetMapping("/api/padarias/{id}")
    public Padaria getPadaria(@PathVariable long id){
        Padaria p = null;
        for(Padaria padaria : padarias){
            if (id == padaria.getId()) {
                p = padaria;
            }
        }
        return p;
    }

    @PostMapping("/api/padarias")
    public Padaria createPadaria(@RequestBody Padaria novPadaria){
        long novoId = padarias.getLast().getId() + 1;
        novPadaria.setId(novoId);
        padarias.add(novPadaria);
        return novPadaria;
    }
}
