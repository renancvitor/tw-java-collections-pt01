package desafioChatGPT;

import java.util.*;

public class SistemaEventos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> eventos = new HashMap<>();

        System.out.print("\nDigite quantos eventos deseja cadastrar:  ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDigite o nome do evento (sem espaços) e " +
                "então de um espaço para digitar o(s) nome(s)" +
                "do(s) participante(s). ");
        System.out.println("Exemplo: \nFeiraA Creuza Alex Jubileu");
        System.out.println("Sua vez:");

        for (int i = 0; i < n; i++) {
            String linhaEvento = scanner.nextLine();
            String[] partes = linhaEvento.split(" ");

            String evento = partes[0];
            for (int j = 1; j < partes.length; j++) {
                String participantes = partes[j];
                eventos.computeIfAbsent(participantes, k -> new ArrayList<>()).add(evento);
            }
        }

        System.out.print("\nDigite o nome do participante para consultar " +
                "em qual ou quais eventos ele irá participar:  ");
        int m = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < m; i++) {
            System.out.print("Participante: ");
            String participanteConsulta = scanner.nextLine();

            if (eventos.containsKey(participanteConsulta)) {
                System.out.println(eventos.get(participanteConsulta));
            } else {
                System.out.println("PARTICIPANTE NÃO ENCONTRADO");
            }
        }

        scanner.close();
    }
}
