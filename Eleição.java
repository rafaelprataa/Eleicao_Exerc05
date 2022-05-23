package exercicios;
import java.util.Scanner;
public class Eleição {

	public static void main(String[] args) {
		Scanner entrada = new Scanner( System.in);
      
		int pt = 0, pdt = 0, pl = 0, psdb = 0, VotNulo = 0, VotBranco = 0;  // Declareis as respectivas variaveis

			for(int i=0; i < 50; i++){ // criei um ciclo FOR, para se repetir no total de 50 vezes
            int votoN; // variavel int para captar qual opção o usuario votou
            System.out.println("Vote nas seguintes opções: 1-PT / 2-PDT / 3-PL / 4-PSDB / 5- VOTO NULO / 6- VOTO EM BRANCO)"); // usuario vota 50 vezes
            votoN = entrada.nextInt();

            switch(votoN){ // switch para avaliar em qual opção que o usuario digitou se encaixa
                case 1:
                    pt = pt + 1; // pt = pt +1 para o voto ser igual a 1 e assim respectivamente 
                    break;
                case 2:
                    pdt = pdt + 1;
                    break;
                case 3:
                    pl = pl + 1;
                    break;
                case 4:
                    psdb = psdb + 1;
                    break;
                case 5:
                    VotNulo = VotNulo + 1;
                    break;
                case 6:
                    VotBranco = VotBranco + 1;
                    break;
                default: // caso o usuario digite um numero que não está disponivel...
                    System.out.println("Vote em uma das opções disponiveis!"); // informe para votar em um numero disponivel
            }
        } 
        System.out.println("Total de votos no PT: " + pt); //exibir total de votos em cada partido, e assim respectivamente 
        System.out.println("Total de votos no PDT: " + pdt);
        System.out.println("Total de votos no PL: " + pl);
        System.out.println("Total de votos no PSDB: " + psdb);
        System.out.println("Total votos NULO: " + VotNulo);
        System.out.println("Total votos em BRANCO: " + VotBranco);

        entrada.close();
		
	}

}
