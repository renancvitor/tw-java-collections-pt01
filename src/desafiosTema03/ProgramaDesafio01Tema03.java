package desafiosTema03;

import java.util.Scanner;

public class ProgramaDesafio01Tema03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ModeloDesafio01Tema03<Integer> lista = new ModeloDesafio01Tema03<Integer>();
        for (int i = 0; i < n; i++) {
            int valor = scan.nextInt();
            lista.inserir(valor);
        }

        

        scan.close();
    }
}
