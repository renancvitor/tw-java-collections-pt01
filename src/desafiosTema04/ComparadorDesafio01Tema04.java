package desafiosTema04;

import java.util.Comparator;

public class ComparadorDesafio01Tema04 implements Comparator<ModeloDesafio01Tema04> {

    @Override
    public int compare(ModeloDesafio01Tema04 o1, ModeloDesafio01Tema04 o2) {
        return o1.nome.compareTo(o2.nome);
    }
}
