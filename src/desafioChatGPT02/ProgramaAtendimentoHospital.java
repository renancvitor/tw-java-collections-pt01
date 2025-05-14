package desafiosTema06;

import desafioChatGPT02.entites.Paciente;
import desafioChatGPT02.model.AtendimentoPrioridadesHospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaAtendimentoHospital {

    private final static Scanner scan = new Scanner(System.in);
    private final static AtendimentoPrioridadesHospital atendimento = new AtendimentoPrioridadesHospital();

    public static void main(String[] args) {
        int totalEventos = Integer.parseInt(scan.nextLine());
        List<String> eventos = new ArrayList<>();

        while (totalEventos-- != 0) {
            String evento = scan.nextLine();
            eventos.add(evento);
        }

        List<Paciente> pacientes = atendimento.getPacientes(eventos);

        if (pacientes.isEmpty()) {
            System.out.println("VAZIO");
        } else {
            for (Paciente paciente : pacientes) {
                System.out.println(paciente.getNome());
            }
        }
    }
}
