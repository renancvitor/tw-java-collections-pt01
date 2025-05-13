package desafiosTema06;

import java.util.*;
import java.lang.reflect.*;

public class ProgramaDesafio01Tema06
{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();

            Deque<Character> queue = new ArrayDeque<>();
            boolean balanceado = true;

            for (char c : input.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    queue.addLast(c);
                } else if (c == ')' || c == '}' || c == ']') {
                    if (queue.isEmpty()) {
                        balanceado = false;
                        break;
                    }

                    char topo = queue.remove();

                    if ((c == ')' && topo != '(') ||
                            (c == '}' && topo != '{') ||
                            (c == ']' && topo != '[')) {
                        balanceado = false;
                        break;
                    }
                }
            }

            if (!queue.isEmpty()) {
                balanceado = false;
            }

            System.out.println(balanceado ? "Balanceado" : "Náo balanceado.");

        }
    }
}
