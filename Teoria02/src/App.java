    public class App {
        public static void main(String[] args) throws Exception {
            
            Jogo j1 = new oneTimeBuy("Candy Crush", "Mobile", 10);
            j1.cobrar();
            Jogo j2 = new Assinatura("Playstation Plus", "Diversos", 32, "Intermediário");
            j2.cobrar();
        }
    }
