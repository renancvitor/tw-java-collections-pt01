package desafioChatGPT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControleEstoquePorCategoria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> estoque = new HashMap<>();

        System.out.print("\nDigite a quantidade de categorias que deseja cadastrar:  ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nDigite primeiro o nome da categoria e os " +
                    "produtos em seguida na mesma linha:");
            String linhaCategorias = scanner.nextLine();
            String[] partes = linhaCategorias.split(" ");

            String categoria = partes[0]
            for (int j = 0; j < partes.length; j++) {
                estoque.put(partes[j], categoria);
            }
        }

        System.out.print("\nDigite quantas consultas serão feitas no estoque:  ");
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
