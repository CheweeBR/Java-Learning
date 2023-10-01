// Nome: Tiago Eloy Possidonio Pereira / RA: 2417677

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class TiagoEloyPossidonioPereira_Lista3 {
    public static void main(String args[]) {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int alt = 0;
        System.out.println("\n              USO DAS CLASSES WRAPPERS\n");
        System.out.println(
                "[1] INTEGER\n[2] BOOLEAN\n[3] CHARACTER\n[4] DOUBLE\n[5] BYTE\n[6] SHORT\n[7] FLOAT\n[8] LONG\n[0] SAIR");
        try {
            System.out.print("\nAlternativa: ");
            alt = Integer.parseInt(ler.readLine());
        } catch (Exception e) {
            if (alt > 8) {
                System.out.println("\nAlternativa invalida");
            }
        }
        switch (alt) {
            case 0:
                System.out.println("\n Encerrando aplicativo.");
            case 1:
                Integerx();
                break;
            case 2:
                Booleanx();
                break;
            case 3:
                Characterx();
                break;
            case 4:
                Doublex();
                break;
            case 5:
                Bitex();
                break;
            case 6:
                Shortx();
                break;
            case 7:
                Floatx();
                break;
            case 8:
                Longx();
                break;
            default:
                System.out.println("\nAlternartiva invalida!");
                break;
        }
    }

    // 1) A classe Integer há dois métodos: parseInt() e ToString()
    // 2) o método Intergerx irá converter o valor de um tipo primitivo INT para
    // STRING e vice versa (STRING->INT).
    // 3)
    // Referência:<https://moodle.utfpr.edu.br/pluginfile.php/2813861/mod_resource/content/2/Pesquisa_Classes_Wrappers.pdf>
    public static void Integerx() {
        int a = Integer.parseInt("1");
        String b = Integer.toString(12);
    }

    // 1) A classe Boolean encapsula um valor do tipo primitivo boolean em um
    // objeto.
    // 2) O método Booleanx retorna um objeto String que representa o valor deste
    // Boolean.
    // 3) Referência: <https://www.geeksforgeeks.org/java-lang-boolean-class-java/>
    public static void Booleanx() {
        boolean a = true;
        boolean b = false;

        String s1 = Boolean.toString(a);
        String s2 = Boolean.toString(b);

        System.out.println("/n" + s1);
        System.out.println(s2);
    }

    public static void Characterx() {

    }

    // 1) é uma classe wrapper para o tipo primitivo double que contém vários
    // métodos para lidar efetivamente com um valor duplo, como convertê-lo em uma
    // representação de cadeia de caracteres e vice-versa.
    // 2) O método Doublex transforma um objeto de valor double para de tipo String.
    // 3) Referência: <https://www.geeksforgeeks.org/java-lang-double-class-java/>

    public static void Doublex() {
        double b = 55.05;
        System.out.println("toString(b) = " + Double.toString(b));
    }
    // 1) A classe Byte encapsula um valor de byte de tipo primitivo em um objeto.
    // Um objeto do tipo Byte contém um único campo cujo tipo é um byte.
    // 2) O método Bitex transforma um valor de tipo String em um objeto Byte.
    // 3) Referência:
    // <https://www.javaguides.net/2018/08/byte-wrapper-class-in-java.html>

    public static void Bitex() {
        String valor = "55";
        byte x = Byte.parseByte(valor);
        System.out.println("O valor" + x + " da variavel do tipo String foi convertido para um objeto Byte.");
    }

    public static void Shortx() {

    }

    // 1) Float é uma classe wrapper fornecida para encapsular o valor primitivo
    // float.
    // 2) O método Floatx realiza o encapsulamento de uma variavel de tipo primitivo
    // float.
    // 3) Referência:
    // <https://www.tutorialspoint.com/java-float-wrapper-class>

    public static void Floatx() {
        float varfloat = 24.22f;
        Float objFloat = new Float(varfloat);
        System.out.println(objFloat);
    }

    public static void Longx() {

    }
}