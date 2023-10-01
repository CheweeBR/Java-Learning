
// Lucas Feliciano Bassetto / 1750658
// Taigo Eloy Possidonio Pereira / 2417677
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        String host = "localhost"; // Endereço do servidor
        int port = 9999; // Porta do servidor

        try {
            // Cria uma conexão com o servidor
            Socket socket = new Socket(host, port);

            // Cria um BufferedReader para ler do teclado
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Cria um PrintWriter para enviar dados para o servidor
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Solicita ao usuário que insira um número
            System.out.print("Digite um número maior que zero: ");
            String userInput = reader.readLine();

            // Verificador para garantir que o número seja maior que 0
            if (Integer.parseInt(userInput) > 0) {
                // Envia o número para o servidor
                out.println(Integer.parseInt(userInput));

                // Cria um BufferedReader para receber a resposta do servidor
                BufferedReader serverResponse = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                // Lê e imprime a resposta do servidor
                String response = serverResponse.readLine();
                System.out.println("Resposta do servidor: " + response);
            } else {
                System.out.println("O numero digitado deve ser maior que 0");
            }
            // Fecha a conexão
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
