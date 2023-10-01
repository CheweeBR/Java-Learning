// Nome: Tiago Eloy Possidonio Pereira / RA: 2417677

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ContLetTiagoEloyPossidonioPereira {
    public static void main(String args[]) {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int n = 3, c, cont = 0;
        String frase[] = new String[n], letra = "";
        for (c = 0; c < n; c++) {
            try {
                System.out.print("Digite o " + (c + 1) + " elemento: ");
                frase[c] = ler.readLine();
            } catch (Exception e) {
            }

        }
        try {
            System.out.print("Digite uma letra: ");
            letra = ler.readLine();
        } catch (Exception e) {
        }
        for (c = 0; c < n; c++) {
            if (letra == frase[c]) {
                cont++;
            }
        }
        System.out.println("A letra " + letra + " aparece " + cont + " vezes");
    }
}
