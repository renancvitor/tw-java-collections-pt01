package desafioChatGPT;

import java.util.*;

public class SistemaTurmaAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> cadastroTurma = new HashMap<>();

        System.out.print("\nQuantas turmas deseja cadastrar?  ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDigite o nome da turma (sem espaços) e então dê um espaço para digitar " +
                "o(s) nome(s) do(s) aluno(s).");
        System.out.println("Exemplo: \nTurmaA Ana João Pedro");
        System.out.println("Sua vez:");

        for (int i = 0; i < n; i++) {
            String linhaTurma = scanner.nextLine();
            String[] partes = linhaTurma.split(" ");

            String turma = partes[0];
            for (int j = 1; j < partes.length; j++) {
                String aluno = partes[j];
                cadastroTurma.computeIfAbsent(aluno, k -> new ArrayList<>()).add(turma);
            }
        }

        System.out.print("\nDigite a quantidade de alunos que deseja consultar:  ");
        int m = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < m; i++) {
            String alunoConsulta = scanner.nextLine();

            if (cadastroTurma.containsKey(alunoConsulta)) {
                System.out.println(cadastroTurma.get(alunoConsulta));
            } else {
                System.out.println("ALUNO NÃO ENCONTRADO");
            }
        }

        scanner.close();
    }
}
