public class App1 {
    public static void main(String[] args) {
        GerenciadorNomes g = new GerenciadorNomesMem();
        g.adicionarNome("Fulano");
        g.adicionarNome("Beltrano");
        
        System.out.println(g.obterNomes());
    }
}

