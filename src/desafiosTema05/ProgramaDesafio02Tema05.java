package desafiosTema05;

import java.util.*;

public class ProgramaDesafio02Tema05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.valueOf(s.nextLine());

        List<String> nomes = new ArrayList<String>();

        for (int i = 0; i < t; i++) {
            nomes.add(s.nextLine());
        }

        Collections.sort(nomes);

        Set<String> ordenacao = new TreeSet<>(nomes);

        for (String nome : ordenacao) {
            System.out.println(nome);
        }

        s.close();
    }
}
