package projeto_ps2.projeto01;
import java.util.ArrayList;
import java.util.List;

public class EmpresaController {
    private List <Empresa> empresas;

    public EmpresaController(){
        this.empresas = new ArrayList<>();
        empresas.add(new Empresa("Empresa A", "12345678910","empresaA@mail.com","Rua A 111","..."));
    }
}
