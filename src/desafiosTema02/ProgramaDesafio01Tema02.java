package desafiosTema02;

import java.util.*;

public class ProgramaDesafio01Tema02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<List<Integer>> linhas = new ArrayList<>();

        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            String linha = scan.nextLine().trim();
            List<Integer> numeros = new ArrayList<>();

            if (!linha.isEmpty()) {
                String[] partes = linha.split(" ");
                for (int j = 1; j < partes.length; j++) {
                    numeros.add(Integer.parseInt(partes[j]));
                }
            }

            linhas.add(numeros);
        }

        int consulta = scan.nextInt();
        for (int i = 0; i < consulta; i++) {
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;

            if (x >= 0 && x < linhas.size()) {
                List<Integer> linha = linhas.get(x);

                if (y >= 0 && y < linha.size()) {
                    System.out.println(linha.get(y));
                } else {
                    System.out.println("ERRO!");
                }
            } else {
                System.out.println("ERRO!");
            }
        }

        scan.close();
    }
}
