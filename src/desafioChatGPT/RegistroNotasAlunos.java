package desafioChatGPT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroNotasAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Double>> registroNotas = new HashMap<>();

        System.out.print("\nQuantos alunos deseja cadastrar:  ");

        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDigite o nome do aluno seguido das disciplinas e notas");
        System.out.println("Exemplo: \nMaria Matemática 7.5 Geografia 9.0" +
                "\nSua vez:");

        for (int i = 0; i < n; i++) {
            String linhaRegistro = scanner.nextLine();
            String[] partes = linhaRegistro.split(" ");

            String aluno = partes[0];
            registroNotas.computeIfAbsent(aluno, k -> new HashMap<>());

            for (int j = 1; j < partes.length; j += 2) {
                String materia = partes[j];
                double nota = Double.parseDouble(partes[j + 1]);
                registroNotas.get(aluno).put(materia, nota);
            }
        }

        System.out.print("\nDigite quantas consultas deseja realizar:  ");

        int m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDigite o nome do aluno que deseja consultar:");

        for (int i = 0; i < m; i++) {
            String alunoConsulta = scanner.nextLine();

            if (registroNotas.containsKey(alunoConsulta)) {
                System.out.println(registroNotas.get(alunoConsulta));;
            } else {
                System.out.println("ALUNO NÃO ENCONTRADO");
            }
        }

        scanner.close();
    }
}
