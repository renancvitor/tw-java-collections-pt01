package javaCollection;

import modelCollection.Pessoa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hellot world!");

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa(1, "TreinaWeb 01"));
        pessoas.add(new Pessoa(2, "TreinaWeb 02"));

//        for (int i = 0; i < pessoas.size(); i++) {
//            Pessoa p = pessoas.get(i);
//            System.out.println(p);
//        }
        Iterator<Pessoa> iteratorPessoa = pessoas.iterator();
        while (iteratorPessoa.hasNext()) {
            Pessoa p = iteratorPessoa.next();
            System.out.println(p);
        }
        System.out.println("Fim!");
    }
}
