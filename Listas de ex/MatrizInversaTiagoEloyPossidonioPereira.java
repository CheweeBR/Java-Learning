
// Nome: Tiago Eloy Possidonio Pereira / RA: 2417677
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class MatrizInversaTiagoEloyPossidonioPereira {
    public static void main(String args[]) {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int n = 2, c, l;
        int matriz[][] = new int[n][n];
        for (l = 0; l < n; l++) {
            for (c = 0; c < n; c++) {
                try {
                    System.out.print("Insira o valor da " + (l + 1) + " linha e " + (c + 1) + " coluna: ");
                    matriz[l][c] = Integer.parseInt(ler.readLine());
                } catch (Exception e) {
                    System.out.println("Valor invalido");
                    c--;
                }
            }
        }
        System.out.println("\n-----------------\n Matriz inverso   \n-----------------\n");
        for (l = n - 1; l > -1; l--) {
            for (c = n - 1; c > -1; c--) {
                System.out.print(matriz[l][c]);
            }
            System.out.println("");
        }
    }
}
