package desafiosTema04;

import java.util.Comparator;

public class ComparadorDesafio01Tema04 implements Comparator<ModeloDesafio01Tema04> {

    @Override
    public int compare(ModeloDesafio01Tema04 o1, ModeloDesafio01Tema04 o2) {
        return Integer.compare(o2.placar, o1.placar);
    }
}
