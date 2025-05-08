package javaCollection;

import comparadoresCollection.PessoaTamanhoNomeComparator;
import modelCollection.Pessoa;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nHellot world!");

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa(1, "CccTreinaWeb 01"));
        pessoas.add(new Pessoa(4, "BbTreinaWeb 04"));
        pessoas.add(new Pessoa(2, "DdddTreinaWeb 02"));
        pessoas.add(new Pessoa(3, "ATreinaWeb 03"));

        // Collections.sort(pessoas, new PessoaTamanhoNomeComparator());

        // Collections.sort(pessoas);

//        Collections.sort(pessoas, (o1, o2) -> {
//            if (o1.getNome().length() == o2.getNome().length()) {
//                return 0;
//            } else if (o1.getNome().length() <  o2.getNome().length()) {
//                return -1;
//            }
//            return 1;
//        });

//        pessoas.sort((o1, o2) -> {
//            if (o1.getNome().length() == o2.getNome().length()) {
//                return 0;
//            } else if (o1.getNome().length() <  o2.getNome().length()) {
//                return -1;
//            }
//            return 1;
//        });
        pessoas.sort(Comparator.comparing(Pessoa::getNome, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return 0;
            } else if (o1.length() <  o2.length()) {
                return -1;
            }
            return 1;
        }));
        System.out.println("Comparando com nome:");
        System.out.println(pessoas);

        pessoas.sort(Comparator.comparingInt(Pessoa::getId));
        System.out.println("\nComparando com idL");
        System.out.println(pessoas);

//        System.out.println("\nCom laço for");
//        for (int i = 0; i < pessoas.size(); i++) {
//            Pessoa p = pessoas.get(i);
//            System.out.println(p);
//        }

        System.out.println("\nCom Iterator");
        Iterator<Pessoa> iteratorPessoa = pessoas.iterator();
//        while (iteratorPessoa.hasNext()) {
//            Pessoa p = iteratorPessoa.next();
//            if (p.getId() == 1) {
//                iteratorPessoa.remove();
//            }
//            System.out.println(p);
//        }
        pessoas.removeIf(pessoa -> pessoa.getId() == 1);
        // System.out.println(pessoas);

//        System.out.println("\nUsando forEach");
//        for (Pessoa p : pessoas) {
//            System.out.println(p);
//        }
        System.out.println("\nFim!");
    }
}
