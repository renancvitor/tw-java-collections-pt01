package desafio01Tema02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaDesafio02Tema02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> L = new ArrayList<>();

        int n = scan.nextInt();
        scan.nextLine();

        String linha = scan.nextLine().trim();
        String[] numeros = linha.split(" ");

        for (int i = 0; i < n; i++) {
            L.add(Integer.parseInt(numeros[i]));
        }

        int qtdAcao = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < qtdAcao; i++) {
            String comando = scan.nextLine().trim();
            String[] numero = scan.nextLine().trim().split(" ");

            if (comando.equalsIgnoreCase("Inserir")) {
                int indice = Integer.parseInt(numero[0]);
                int valor = Integer.parseInt(numero[1]);
                L.add(indice, valor);
            } else if (comando.equalsIgnoreCase("Deletar")) {
                int indice = Integer.parseInt(numero[0]);
                L.remove(indice);
            }
        }

        System.out.println(L);

        scan.close();
    }
}
