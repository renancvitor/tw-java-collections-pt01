package modelCollection;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {

    private int id;
    private String nome;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return id == pessoa.id && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "id = " + id +
                ", nome = '" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pessoa o) {
        // 0 se o1 for igual a o2
        if (this.getId() == o.getId()) {
            return 0;
        }
        // -1 se o1 for menor do que o2
        if (this.getId() < o.getId()) {
            return -1;
        }
        // 1 se o1 for maior do que o2
        return 1;
    }
}
