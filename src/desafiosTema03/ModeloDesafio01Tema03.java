package desafiosTema03;

import java.util.ArrayList;
import java.util.Iterator;

public class ModeloDesafio01Tema03<T> {

    private ArrayList<T> list;

    public ModeloDesafio01Tema03() {
        list = new ArrayList<T>();
    }

    public void inserir(T valor) {
        list.add(valor);
    }

    public Iterator<T> iterator() {
        return list.iterator();
    }
}
