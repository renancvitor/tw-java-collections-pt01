package desafioChatGPT;

import java.util.*;

public class ControleEstoqueSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> estoque = new HashMap<>();

        System.out.println("\nDigite abaixo quantos produtos serão " +
                "cadastrados no sistema:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            String[] partes = linha.split(" ");
            String produto = partes[0];
            int quantidade = Integer.parseInt(partes[1]);

            estoque.put(produto, quantidade);
        }

        System.out.println("\nDigite abaixo quantas consultas serão "+
                "no sistema:");
        int m = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < m; i++) {
            String produtoConsulta = scanner.nextLine();

            if (estoque.containsKey(produtoConsulta)) {
                System.out.println(estoque.get(produtoConsulta));
            } else {
                System.out.println("PRODUTO NÃO ENCONTRADO");
            }
        }

        scanner.close();
    }
}
