package desafio01Tema02;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProgramaDesafio01Tema02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<List<Integer>> linhas = new ArrayList<>();

        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            String linha = scan.nextLine().trim();
            List<Integer> numeros = new ArrayList<>();

            if (!linha.isEmpty()) {
                String[] partes = linha.split(" ");
                for (String parte : partes) {
                    numeros.add(Integer.parseInt(parte));
                }
            }

            linhas.add(numeros);
        }

        int consulta = scan.nextInt();
        for (int i = 0; i < consulta; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            if (x >= 0 && x < linhas.size()) {
                List<Integer> linha = linhas.get(x);

                if (y >= 0 && y < linha.size()) {
                    System.out.println(linha.get(y));
                } else {
                    System.out.println("ERRO!");
                }
            } else {
                System.out.println("ERRO!");
            }
        }

        scan.close();
    }
}
