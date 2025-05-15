package desafioChatGPT02.model;

import desafioChatGPT02.entites.Paciente;

import java.util.*;

public class AtendimentoPrioridadesHospital {

    public List<Paciente> getPacientes(List<String> eventos) {
        Queue<Paciente> fila = new PriorityQueue<>(
                Comparator.comparingDouble(Paciente::getPrioridade).reversed()
                        .thenComparing(Paciente::getNome)
                        .thenComparingInt(Paciente::getId)
        );

        for (String evento : eventos) {
            String[] eventoDividido = evento.split(" ");

            if (eventoDividido[0].equals("ADICIONAR")) {
                String nome = eventoDividido[1];
                double prioridade = Double.parseDouble(eventoDividido[2]);
                int id = Integer.parseInt(eventoDividido[3]);

                fila.add(new Paciente(id, nome, prioridade));
            } else if (eventoDividido[0].equals("SERVIR")) {
                fila.poll();
            }
        }

        List<Paciente> resultado = new ArrayList<>();
        while (!fila.isEmpty()) {
            resultado.add(fila.poll());
        }

        return resultado;
    }

}
