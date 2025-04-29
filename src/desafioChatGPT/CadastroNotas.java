package desafioChatGPT;

import java.util.*;

public class CadastroNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> boletim = new HashMap<>();

        System.out.println("Digite abaixo quantas entradas serão " +
                "feitas no sistema:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            String linhaNotas = scanner.nextLine();

            List<Integer> notas = new ArrayList<>();
            if (!linhaNotas.isEmpty()) {
                String[] partes = linhaNotas.split(" ");
                for (String parte : partes) {
                    notas.add(Integer.parseInt(parte));
                }
            }

            boletim.put(nome, notas);
        }

        System.out.println("Digite abaixo quantas consultas serão " +
                "feitas no sistema:");
        int consultas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < consultas; i++) {
            String[] entrada = scanner.nextLine().split(" ");
            String nomeConsulta = entrada[0];
            int indiceNota = Integer.parseInt(entrada[1]);

            if (boletim.containsKey(nomeConsulta)) {
                List<Integer> notas = boletim.get(nomeConsulta);

                if (indiceNota >= 0 && indiceNota < notas.size()) {
                    System.out.println(notas.get(indiceNota));
                } else {
                    System.out.println("NOTA INVÁLIDA!");
                }
            } else {
                System.out.println("NOTA INVÁLIDA!");
            }
        }

        scanner.close();
    }
}
