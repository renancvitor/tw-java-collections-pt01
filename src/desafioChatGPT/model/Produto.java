package desafioChatGPT.model;

public class Produto {
    String nome;
    int quantidade;
    double valor;

    public Produto() {
    }

    public Produto(String nome, int quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean venda(int unidade) {
        if (unidade > this.quantidade) {
            return false; // venda não realizada
        }
        this.quantidade -= unidade;
        return true; // venda realizada com sucesso
    }

    @Override
    public String toString() {
        return String.format("Produto: %s | Quantidade: %d | Preço: R$ %.2f", nome, quantidade, valor);
    }
}
