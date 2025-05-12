package desafiosTema05;

import java.util.*;

public class ProgramaDesafio01Tema05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = scan.next();
            pair_right[i] = scan.next();
        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i< t; i++) {
            set.add(pair_left[i] + "," + pair_right[i]);
            System.out.println(set.size());
        }

        scan.close();
    }
}
