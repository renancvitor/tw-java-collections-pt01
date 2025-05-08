package desafiosTema04;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramaDesafio01Tema04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ModeloDesafio01Tema04[] jogador = new ModeloDesafio01Tema04[n];
        ComparadorDesafio01Tema04 comparador = new ComparadorDesafio01Tema04();

        for(int i = 0; i < n; i++){
            jogador[i] = new ModeloDesafio01Tema04(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(jogador, comparador);
        for(int i = 0; i < jogador.length; i++){
            System.out.printf("%s %s\n", jogador[i].nome, jogador[i].placar);
        }
    }
}
