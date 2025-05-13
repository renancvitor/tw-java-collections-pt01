package desafiosTema06;

import java.util.*;

public class PrioridadesDesafio02Tema06 {

    List<EstudanteDesafio02Tema06> getEstudantes(List<String> eventos) {
        Queue<EstudanteDesafio02Tema06> fila = new PriorityQueue<>(
                Comparator.comparingDouble(EstudanteDesafio02Tema06::getNota).reversed()
                        .thenComparing(EstudanteDesafio02Tema06::getNome)
                        .thenComparingInt(EstudanteDesafio02Tema06::getId)
        );

        for (String evento : eventos) {
            String[] eventoDividido = evento.split(" ");

            if (eventoDividido[0].equals("ADICIONAR")) {
                String nome = eventoDividido[1];
                double nota = Double.parseDouble(eventoDividido[2]);
                int id = Integer.parseInt(eventoDividido[3]);

                fila.add(new EstudanteDesafio02Tema06(id, nome, nota));
            } else if (eventoDividido[0].equals("SERVIR")) {
                fila.poll();
            }
        }

        List<EstudanteDesafio02Tema06> resultado = new ArrayList<>();
        while (!fila.isEmpty()) {
            resultado.add(fila.poll());
        }

        return resultado;
    }
}
