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

            Produto produtoCadastro = new Produto(nome, quantidade, valor);
            estoqueVenda.put(nome, produtoCadastro);
        }

        System.out.print("\nDigite a quantidade de produtos que deseja consultar no estoque:  ");
        int m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDigite o(s) nome(s) do(s) produto(s) para consultar no estoque:");

        for (int i = 0; i < m; i++) {
            String produtoConsulta = scanner.nextLine();

            if (estoqueVenda.containsKey(produtoConsulta)) {
                Produto produtoConsultaEstoque = estoqueVenda.get(produtoConsulta);

                System.out.println("Produto:  " + produtoConsultaEstoque.getNome() + " - Estoque:  " +
                        produtoConsultaEstoque.getQuantidade());
            } else {
                System.out.println("Produto não cadastrado. Verifique!");
            }
        }

        System.out.print("\nDigite a quantidade de vendas que deseja realizar: ");
        int v = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do produto e a quantidade a ser vendida:\"" +
                "\nExemplo:" +
                "\nBanana 5" +
                "\nSua vez:");

        for (int i = 0; i < v; i++) {
            String linhaVenda = scanner.nextLine();
            String[] partesVenda = linhaVenda.split(" ");

            String nomeProduto = partesVenda[0];
            int quantidadeVendida = Integer.parseInt(partesVenda[1]);

            if (estoqueVenda.containsKey(nomeProduto)) {
                Produto produtoParaVenda = estoqueVenda.get(nomeProduto);

                boolean sucesso = produtoParaVenda.venda(quantidadeVendida);

                if (sucesso) {
                    System.out.println("Venda realizada com sucesso!");
                    System.out.println("Estoque após venda:" +
                            "\n" + produtoParaVenda.toString());
                }
            } else {
                System.out.println("Estoque insuficiente para o produto: " + nomeProduto);
            }
        }

        scanner.close();
    }
}
