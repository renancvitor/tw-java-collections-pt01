package javaCollection;

import modelCollection.Pessoa;

import java.util.*;

public class MainSet {

    public static void main(String[] args) {
        System.out.println("HashSet");
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        set.add(3); // Não pode conter elementos duplicados!
        System.out.println(set);

        System.out.println("LinkedhSet");
        Set<Pessoa> set2 = new LinkedHashSet<Pessoa>();
        set2.add(new Pessoa(1, "TreinaWeb 01"));
        set2.add(new Pessoa(2, "TreinaWeb 02"));
        set2.add(new Pessoa(3, "TreinaWeb 03"));
        System.out.println(set2);

        for (Pessoa p : set2) {
            System.out.println(p);
        }

        System.out.println("TreeSet");
        // Armazena os elementos de acordo com a especificação da ordenação
        // De acordo com a lógica implementado no compareTo, neste caso específico
        NavigableSet<Pessoa> set3 = new TreeSet<Pessoa>(); // Também é possível fazer através de
        // expressões lambda, sem o compareTo implementado na classe modelo
        set3.add(new Pessoa(1, "TreinaWeb 01"));
        set3.add(new Pessoa(2, "TreinaWeb 02"));
        set3.add(new Pessoa(3, "TreinaWeb 03"));
        System.out.println(set3);
        Pessoa teste = set3.lower(new Pessoa(2, "TreinaWeb 02"));
        System.out.println(teste);

        for (Pessoa p : set3) {
            System.out.println(p);
        }
    }
}
