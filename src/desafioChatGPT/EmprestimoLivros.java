package desafioChatGPT;

import java.util.*;

public class EmprestimoLivros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> biblioteca = new HashMap<>();

        System.out.print("\nDigite quantas pessoas pegaram livros emprestados:  ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nAgora digite o nome da pessoa que pegou livro emprestado" +
                "e o nome do livro que foi pego." +
                "\nExemplo:" +
                "\nJoaquim LivroZ" +
                "\nSua vez:");

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            String[] partes = linha.split(" ");

            String pessoa = partes[0];
            for (int j = 1; j < partes.length; j++) {
                String livros = partes[j];
                biblioteca.computeIfAbsent(pessoa, k -> new ArrayList<>()).add(livros);
            }
        }

        System.out.print("\nDigite a quantidade de pessoas que deseja consultar:  ");
        int m = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < m; i++) {
            String nomeConsulta = scanner.nextLine();

            if (biblioteca.containsKey(nomeConsulta)) {
                System.out.println(biblioteca.get(nomeConsulta));
            } else {
                System.out.println(String.format("%s náo retirou nenhum livro!", nomeConsulta));
            }
        }

        scanner.close();
    }
}
