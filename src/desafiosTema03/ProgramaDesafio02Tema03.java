package desafiosTema03;

import java.util.Scanner;

public class ProgramaDesafio02Tema03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ModeloDesafio02Tema03<Integer> lista = new ModeloDesafio02Tema03<Integer>();
        for (int i = 0; i < n; i++) {
            int valor = scan.nextInt();
            lista.inserir(valor);
        }

        for(int valor : lista){
            System.out.print(valor + " ");
        }
    }
}
