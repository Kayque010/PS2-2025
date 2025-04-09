package ps2.lab07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import java.util.*;


@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired 
	private MusicasRepo musicasRepo;

	private static Scanner entrada = new Scanner(System.in);


	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String ... args){

		System.out.println("========= Cadastro de Músicas: =========");
		boolean sair = false;
		while(!sair){
			System.out.println(" 1 - Digite 1 para cadastrar uma Musica: ");
			System.out.println(" 0 - Digite 0 (zero) para Sair: ");
			int opcao = Integer.parseInt(entrada.nextLine());
			switch (opcao) {
				case 1: cadastrarMusica(); break;
				case 0: sair = true; break;
			
				default:
					System.out.println("Opção Inválida\n");
			}
		}
	}

		public void cadastrarMusica(){
			Scanner entrada = new Scanner(System.in);
			Musicas m = new Musicas();
			System.out.println("Qual o nome da Música:");
				m.setTitulo(entrada.nextLine());
				m.getTitulo();
				System.out.println("Qual o nome do Compositor:");
				m.setCompositor(entrada.nextLine());
				m.getCompositor();
				System.out.println("Qual o ano da musica:");
				m.setAno(entrada.nextInt());
				m.getAno();
				musicasRepo.save(m);
				entrada.close();
	}

}
