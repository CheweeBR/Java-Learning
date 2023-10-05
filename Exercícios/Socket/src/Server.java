// Lucas Feliciano Bassetto / 1750658
// Taigo Eloy Possidonio Pereira / 2417677

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        int port = 9999; // Porta do servidor

        try {
            // Cria um ServerSocket que escuta na porta especificada
            ServerSocket serverSocket = new ServerSocket(port);

            System.out.println("Aguardando conexão do cliente com o servidor...");

            // Aguarda uma conexão de cliente
            Socket clientSocket = serverSocket.accept();

            // Cria um BufferedReader para ler dados do cliente
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Lê o número enviado pelo cliente
            String clientInput = in.readLine();

            // Converte o número para um valor inteiro
            float number = Float.parseFloat(clientInput);
            // Realiza os cálculos com base nas letras fornecidas
            float secondLetterAluno1 = 85; // Letra U do Aluno 1 (Lucas Bassetto)
            float firstLetterAluno2 = 69; // Letra E do Aluno 2 (Tiago Eloy)

            float result = (number * secondLetterAluno1) / firstLetterAluno2;

            // Cria um PrintWriter para enviar a resposta para o cliente
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Envia o resultado de volta ao cliente
            out.println("Resultado do calculos: " + result);

            // Fecha a conexão
            clientSocket.close();
            serverSocket.close();
            System.out.println("Sessão encerrada...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
