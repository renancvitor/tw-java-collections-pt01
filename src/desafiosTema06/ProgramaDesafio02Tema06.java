package desafiosTema06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Arrays;

public class ProgramaDesafio02Tema06 {

    private final static Scanner scan = new Scanner(System.in);
    private final static PrioridadesDesafio02Tema06 prioridades = new PrioridadesDesafio02Tema06();

    public static void main(String[] args) {
        int totalEventos = Integer.parseInt(scan.nextLine());
        List<String> eventos = new ArrayList<>();

        while (totalEventos-- != 0) {
            String evento = scan.nextLine();
            eventos.add(evento);
        }

        List<EstudanteDesafio02Tema06> estudantes = prioridades.getEstudantes(eventos);

        if (estudantes.isEmpty()) {
            System.out.println("VAZIO");
        } else {
            for (EstudanteDesafio02Tema06 st: estudantes) {
                System.out.println(st.getNome());
            }
        }
    }
}
