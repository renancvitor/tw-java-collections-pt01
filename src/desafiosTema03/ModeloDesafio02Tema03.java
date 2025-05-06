package desafiosTema03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class ModeloDesafio02Tema03<T> implements Iterable<T> {

    private ArrayList<T> list;

    public void inserir(T valor) {
        list.add(valor);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModeloDesafio02Tema03<?> that = (ModeloDesafio02Tema03<?>) o;
        return Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(list);
    }
}
