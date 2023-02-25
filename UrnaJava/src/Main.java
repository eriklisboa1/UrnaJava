import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Votacao votacao = new Votacao();
        boolean run = true;
        while (run) {
            System.out.println("Em quem voce quer votar:\n1-Candidato LP" +
                    "\n2-Candidato FR\n3-Candidato ISI\n4-Nulo\n5-Branco\n6-SAIR\n");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    votacao.AddLP();
                    break;
                case 2:
                    votacao.AddFR();
                    break;
                case 3:
                    votacao.AddISI();
                    break;
                case 4:
                    votacao.AddNulo();
                    break;
                case 5:
                    votacao.AddBranco();
                    break;
                case 6:
                    run = false;
                    break;
            }

        }

        int TotalVotos = votacao.getBranco() +votacao.getNulo() + votacao.getISI()
        + votacao.getFR() + votacao.getLP();
        ;
        float VotosBrancos = (votacao.getBranco() * 100.0f) / TotalVotos;
        float VotosNulo = (votacao.getNulo() * 100.0f) / TotalVotos;
        System.out.println("VOTAÇÃO ENCERRADA");
        System.out.println("Candidato Lp: " + votacao.getFR() + "votos");
        System.out.println("Candidato FR: " + votacao.getFR() + " votos");
        System.out.println("Cadidato ISI: " + votacao.getISI() + "votos");
        System.out.println("Votos Nulos: "+ votacao.getNulo()+" votos");
        System.out.println("Votos Brancos: "+ votacao.getBranco()+ "votos");
        System.out.println("% Votos Brancos nesta urna = " +VotosBrancos+"%");
        System.out.println("% Votos Nulos nesta urna = " + VotosNulo+"%");
        if( votacao.getFR() > votacao.getLP() && votacao.getFR() > votacao.getISI()){
            System.out.println("Cadidato FR ganhou!");
        }else if (votacao.getLP() > votacao.getFR() && votacao.getLP() > votacao.getISI()) {
            System.out.println("Cadidato LP ganhou!");
        }else if(votacao.getISI() > votacao.getLP() && votacao.getISI() > votacao.getFR()){
            System.out.println("Cadidato ISI ganhou");
        }else if (votacao.getFR() == votacao.getLP() && votacao.getLP() == votacao.getISI()) {
            System.out.println("Empate");
        }else if(votacao.getFR() == votacao.getLP()){
            System.out.println("Empate");
        }else if(votacao.getLP() == votacao.getISI()){
            System.out.println("Empate");
        }
        }

    }

