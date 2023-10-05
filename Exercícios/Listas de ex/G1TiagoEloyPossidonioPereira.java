// Nome: Tiago Eloy Possidonio Pereira / RA: 2417677

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class G1TiagoEloyPossidonioPereira {
    public static int ad;
    public static int sub;
    public static int div;
    public static int mult;

    public static void main(String args[]) {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int alt = 0, n1 = Integer.parseInt(args[0]), n2 = Integer.parseInt(args[1]), result = 0;
        System.out.println("\n------------------------- \n Tabela de opções \n-------------------------");
        System.out.println("1 - Adição (" + n1 + "+" + n2 + ")");
        System.out.println("2 - Subtração (" + n1 + "-" + n2 + ")");
        System.out.println("3 - Divisão (" + n1 + "/" + n2 + ")");
        System.out.println("4 - Multiplicação (" + n1 + "x" + n2 + ")\n-------------------------");
        try {
            System.out.print("Alternativa: ");
            alt = Integer.parseInt(ler.readLine());
        } catch (Exception e) {
            System.out.println("Erro na entrada de dados.");
        }
        switch (alt) {
            case 1:
                result = ad(n1, n2);
                System.out.println("Resultado: " + n1 + "+" + n2 + " = " + result);
                break;
            case 2:
                result = sub(n1, n2);
                System.out.println("Resultado: " + n1 + "-" + n2 + " = " + result);
                break;
            case 3:
                result = div(n1, n2);
                System.out.println("Resultado: " + n1 + "/" + n2 + " = " + result);
                break;
            case 4:
                result = mult(n1, n2);
                System.out.println("Resultado: " + n1 + "x" + n2 + " = " + result);
                break;
            default:
                System.out.print("O número digitado não está na tabelas de opções.");
        }
    }

    public static int ad(int a, int b) {
        int calc = a + b;
        return calc;
    }

    public static int sub(int a, int b) {
        int calc = a - b;
        return calc;
    }

    public static int div(int a, int b) {
        int calc = a / b;
        return calc;
    }

    public static int mult(int a, int b) {
        int calc = a * b;
        return calc;
    }
}