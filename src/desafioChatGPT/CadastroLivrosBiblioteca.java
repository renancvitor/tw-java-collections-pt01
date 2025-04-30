package desafioChatGPT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CadastroLivrosBiblioteca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> acervo = new HashMap<>();

        System.out.print("\nDigite o livro que deseja cadastrar e sua respectiva quantidade de " +
                "exemplares:  ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String linhaLivros = scanner.nextLine();
            String[] partes = linhaLivros.split(" ");

            int quantidade = Integer.parseInt(partes[partes.length - 1]);

            StringBuilder livro = new StringBuilder();
            for (int j = 0; j < partes.length - 1; j++) {
                livro.append(partes[j]);
                if (j < partes.length - 2) {
                    livro.append(" ");
                }
            }

            acervo.put(livro.toString(), quantidade);
        }

        System.out.print("\nDigite quantos livros deseja consultar no sistema:  ");
        int m = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < m; i++) {
            String livroConsulta = scanner.nextLine();

            if (acervo.containsKey(livroConsulta)) {
                System.out.println(acervo.get(livroConsulta));
            } else {
                System.out.println("LIVRO NÃO ENCONTRADO");
            }
        }

        scanner.close();
    }
}
