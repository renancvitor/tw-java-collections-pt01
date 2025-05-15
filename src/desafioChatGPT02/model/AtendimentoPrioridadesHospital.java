package desafioChatGPT02.model;

import desafioChatGPT02.entites.Paciente;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class AtendimentoPrioridadesHospital {

    List<Paciente> getPacientes(List<String> eventos) {
        Queue<Paciente> fila = new PriorityQueue<>(
                Comparator.comparingDouble(Paciente::getPrioridade).reversed()
                        .thenComparing(Paciente::getNome)
                        .thenComparingInt(Paciente::getId)
                );

        for (String evento : eventos) {
            String[] eventoDividido = evento.split(" ");
            
        }

        return null;
    }

}
