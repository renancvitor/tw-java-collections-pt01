package desafiosTema06;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class PrioridadesDesafio02Tema06 {

    List<EstudanteDesafio02Tema06> getEstudantes(List<String> eventos) {
        List<EstudanteDesafio02Tema06> estudantes = new ArrayList<>();

        for (String evento : eventos) {
            if (evento.startsWith())
        }

        estudantes.sort(
                Comparator.comparingDouble(EstudanteDesafio02Tema06::getNota).reversed()
                        .thenComparing(EstudanteDesafio02Tema06::getNome)
                        .thenComparingInt(EstudanteDesafio02Tema06::getId));

        return estudantes;
    }
}
