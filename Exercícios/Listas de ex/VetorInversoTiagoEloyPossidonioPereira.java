
// Nome: Tiago Eloy Possidonio Pereira / RA: 2417677
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class VetorInversoTiagoEloyPossidonioPereira {
    public static void main(String args[]) {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int n = 5, c;
        int vetor[] = new int[n];
        for (c = 0; c < n; c++) {
            try {
                System.out.print("Insira o " + (c + 1) + " valor: ");
                vetor[c] = Integer.parseInt(ler.readLine());
            } catch (Exception e) {
                System.out.println("Valor invalido");
                c--;
            }
        }
        System.out.println("\n-----------------\n Vetor inverso   \n-----------------\n");
        for (c = n - 1; c > -1; c--) {
            System.out.println((c + 1) + " valor = " + vetor[c]);
        }
    }
}
