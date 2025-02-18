
        public class oneTimeBuy extends Jogo {


            public oneTimeBuy(String nome, String tipo, double valor) {
                super(nome, tipo, valor);
            }

                @Override
                public void cobrar(){
                    System.out.println("Enviando cobrança para o seu cartão de crédito.");
                    System.out.println("Dados do Jogo adquirido: ");
                    System.out.println(super.toString());
                }
            }
