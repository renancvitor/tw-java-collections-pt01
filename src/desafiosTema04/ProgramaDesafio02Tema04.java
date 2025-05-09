package desafiosTema04;

import modelCollection.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProgramaDesafio02Tema04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ModeloDesafio02Tema04[] jogadores = new ModeloDesafio02Tema04[n];

        for(int i = 0; i < n; i++){
            jogadores[i] = new ModeloDesafio02Tema04(scan.next(), scan.nextInt());
        }
        scan.close();

        List<ModeloDesafio02Tema04> listaJogadores = new ArrayList<>(List.of(jogadores));
        listaJogadores.sort(
                Comparator.comparingInt((ModeloDesafio02Tema04 j) -> j.placar)
                        .reversed()
                        .thenComparing(j -> j.nome)
        );

        for(ModeloDesafio02Tema04 jogador : listaJogadores)
            System.out.printf("%s %s\n", jogador.nome, jogador.placar);
    }
}

