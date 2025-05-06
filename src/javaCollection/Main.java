package javaCollection;

import modelCollection.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nHellot world!");

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa(1, "TreinaWeb 01"));
        pessoas.add(new Pessoa(2, "TreinaWeb 02"));
        pessoas.add(new Pessoa(3, "TreinaWeb 03"));

        Collections.sort(pessoas);
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
        System.out.println(pessoas);

//        System.out.println("\nUsando forEach");
//        for (Pessoa p : pessoas) {
//            System.out.println(p);
//        }
        System.out.println("\nFim!");
    }
}
