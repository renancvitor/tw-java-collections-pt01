package desafioChatGPT;

import desafioChatGPT.model.Produto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControleEstoqueVenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Produto> estoqueVenda = new HashMap<>();

        System.out.print("\nDigite a quantidade de produtos que deseja cadastrar:  ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDigite o nome do produto, quantidade e preço." +
                "\nExemplo:" +
                "\nBanana 10 4.50" +
                "\nSua vez:");

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            String[] partes = linha.split(" ");

            String nome = partes[0];
            int quantidade = Integer.parseInt(partes[1]);
            double valor = Double.parseDouble(partes[2]);

            Produto produto = new Produto(nome, quantidade, valor);
            estoqueVenda.put(nome, produto);
        }

        System.out.print("\nDigite a quantidade de produtos que deseja consultar no estoque:  ");
        int m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDigite o(s) nome(s) do(s) produto(s) para consultar no estoqueP:");

        for (int i = 0; i < m; i++) {
            String produtoConsulta = scanner.nextLine();

            if (estoqueVenda.containsKey(produtoConsulta)) {
                Produto produto = estoqueVenda.get(produtoConsulta);

                System.out.println("Produto:  " + produto.getNome());
                System.out.println("Estoque:  " + produto.getQuantidade());
            } else {
                System.out.println("Produto não cadastrado. Verifique!");
            }
        }

        scanner.close();
    }
}
