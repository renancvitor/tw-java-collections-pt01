package desafioChatGPT02.entites;

public class Paciente {

    private int id;
    private String nome;
    private double prioridade;

    public Paciente(int id, String nome, double prioridade) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPrioridade() {
        return prioridade;
    }
}
