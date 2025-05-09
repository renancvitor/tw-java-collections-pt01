package javaCollection;

import modelCollection.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        set.add(3); // Não pode conter elementos duplicados!
        System.out.println(set);

        Set<Pessoa> setPessoa = new HashSet<Pessoa>();
        setPessoa.add(new Pessoa(1, "TreinaWeb 01"));
        setPessoa.add(new Pessoa(2, "TreinaWeb 02"));
        setPessoa.add(new Pessoa(3, "TreinaWeb 03"));
        System.out.println(setPessoa);
    }
}
