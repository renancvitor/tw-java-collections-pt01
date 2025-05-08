package comparadoresCollection;

import modelCollection.Pessoa;

import java.util.Comparator;

public class PessoaTamanhoNomeComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        // -1 se o1 for menor do que o2
//        if (o1.getNome().length() < o2.getNome().length()) {
//            return 1;
//        }

        // 0 se o1 for igual a o2
        if (o1.getNome().length() == o2.getNome().length()) {
            return 0;
        }

        // 1 se o1 for maior do que o2
        if (o1.getNome().length() > o2.getNome().length()) {
            return -1;
        }

        return 1;
    }
}
