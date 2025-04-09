package ps2.lab6;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import static java.lang.System.out;
import java.util.Scanner;


@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	private ProfessorRepo professorRepo;

	@Autowired
	private FaculdadeRepo faculdadeRepo;

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
        
	}

	@Override
	public void run(String... args) {
		out.println("# Gerenciador de Professores e Faculdades!");
		boolean sair = false;
		while (!sair) {
			out.println("(1) Criar Faculdade");
			out.println("(2) Listar Faculdades");
			out.println("(3) Cadastrar Professor");
			out.println("(4) Listar Professores");
			out.println("(0) Sair");
			out.println("Escolha uma opção: ");
			int opcao = Integer.parseInt(entrada.nextLine());
			switch (opcao) {
				case 1: criarFaculdade(); break;
				case 2: listarFaculdades(); break;
				case 3: criarProfessor();break;
				case 4: listarProfessores();break;
				case 0: sair = true; break;

			}
		}
	}

	private void criarFaculdade(){
		out.println("Criação de nova Faculdade: ");
		out.println("Nome da nova faculdade:");
		String nome = entrada.nextLine();
		out.println("Ano da fundação desta faculdade");
		int ano = Integer.parseInt(entrada.nextLine());
		Faculdade f = new Faculdade(nome, ano);
		faculdadeRepo.save(f);
	}

	private void listarFaculdades(){
		out.println("Lista de Faculdades :");
		Iterable<Faculdade> Faculdades = faculdadeRepo.findAll();
		for (Faculdade f: Faculdades){
			out.println(f.getId() + " " + f.getNome() + " " + f.getAnoFundacao());
		}
	}

	private void criarProfessor(){
		out.println("Digite o Nome: ");
		String nome = entrada.nextLine();
		out.println("Digite o CPF: ");
		String cpf = entrada.nextLine();
		out.println("Digite o número de matrícula de Professor: ");
		int matricula = Integer.parseInt(entrada.nextLine());
		Professor p = new Professor(nome, cpf, matricula);
		professorRepo.save(p);
	}

	private void listarProfessores(){
		out.println("Lista de Professores: ");
		Iterable<Professor> professores = professorRepo.findAll();
		for(Professor p: professores){
			out.println(p.getNome() + " " + p.getCpf() + " " + p.getMatricula());
		}
	}


}
