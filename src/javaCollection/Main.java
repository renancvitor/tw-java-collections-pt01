package javaCollection;

import modelCollection.Pessoa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hellot world!");

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa(1, "TreinaWeb 01"));
        pessoas.add(new Pessoa(2, "TreinaWeb 02"));
        System.out.println(pessoas.toString());
    }
}
