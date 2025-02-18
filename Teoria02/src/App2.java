

    public class App2 {
        public static void main(String[] args) throws Exception {
            

            Jogo [] jogos = new Jogo[] {
                new oneTimeBuy("Candy Crush", "Mobile", 10),
                new Assinatura("Playstation Plus", "Diversos", 32, "Intermediário")
            };

            for (Jogo j : jogos){
                System.out.println("=====================");
                j.cobrar();
                if (j instanceof Assinatura){
                    String p = ((Assinatura) j).getPlano();
                    System.out.println("Plano de Assinatura é " + p);
                }
                System.out.println("=====================");
            }
        }
    }
