package aula06.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static java.lang.System.out;
import java.util.Scanner;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	private TitularRepo titularRepo;

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args){
		boolean sair = false;
		while(!sair){
			out.println(" 1 - Criar Titular: ");
			out.println(" 2 - Ler todos os Titulares: ");
			out.println(" 3 - Ler um titular especifico: ");
			out.println(" 4 - Alterar: ");
			out.println(" 5 - Apagar: ");
			out.println(" 0 - Sair: ");
			int opcao = Integer.parseInt(entrada.nextLine());
			switch (opcao) {
				case 1: criar();break;
				case 2: lerTodos();break;
				case 3: ler();break;
				case 4: alterar();break;
				case 5: apagar();break;	
				case 0: sair = true;break;

				default: {
					out.println("Opção Inválida");
				}
			}
		}
	}
	public void criar(){
		out.println("ID do novo titular: ");
		long id = Long.parseLong(entrada.nextLine());
		out.println("Nome do novo titular: ");
	}
	
	public void lerTodos(){
		Iterable<Titular> titulares = titularRepo.findAll();
		out.println("Titulares cadastrados: ");
		for(Titular t: titulares){
			out.println(t.getId() + " - " + t.getNome() + " - " + t.getCpf());
		}
	}

	public void ler(){}
	public void alterar(){}
	public void apagar(){}

}
