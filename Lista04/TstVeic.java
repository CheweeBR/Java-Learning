//Nome: Tiago Eloy Possidonio - RA: 2417677
public class TstVeic {
  public static void main(String[] args) {
    Leitura leitura = new Leitura();
    Passeio passeio = new Passeio();
    Carga carga = new Carga();
    System.out.println("-------------------------------\nTipos de veiculos \n-------------------------------");
    int alt = Integer.parseInt(leitura.entDados("[1] Passeio\n[2] Carga\n-------------------------------\nAlternativa: "));
    System.out.println("\n-------------------------------\n Digite as especificacoes\n-------------------------------");
    if (alt == 1) {
      passeio.getMotor().setPotencia(Integer.parseInt(leitura.entDados("\nPotência do motor: ")));
      passeio.getMotor().setQtdPistoes(Integer.parseInt(leitura.entDados("Quantidade de pistões do motor: ")));
      passeio.setCor(leitura.entDados("Cor do veículo: "));
      passeio.setDataCadastro(leitura.entDados("Data do cadastro: "));
      passeio.setMarca(leitura.entDados("Marca: "));
      passeio.setModelo(leitura.entDados("Modelo: "));
      passeio.setPlaca(leitura.entDados("Placa "));
      passeio.setQtdRodas(Integer.parseInt(leitura.entDados("Quantidade de rodas: ")));
      passeio.setVelocMax(Integer.parseInt(leitura.entDados("Velocidade máxima em km/h: ")));
      if (passeio.getVelocMax() > 250 || passeio.getVelocMax() < 10) {
        System.out.println("Velocidade máxima fora dos limites brasileiros... Valor alterado para 100 km/h");
        passeio.setVelocMax(100);
      }
      passeio.setQtdePassageiros(Integer.parseInt(leitura.entDados("\nQuantidade de passageiros: ")));
      System.out.println("\nEspecificações do veículo:\nPLACA: " + passeio.getPlaca() + "\nMARCA: " + passeio.getMarca());
      System.out.println("MODELO: " + passeio.getModelo() + "\nCOR:" + passeio.getCor());
      System.out.println("QTD DE RODAS: " + passeio.getQtdRodas() + "\nVELOCIDADE MÁX: " + passeio.calcVel() + " m/h");
      System.out.println("QTD DE PASSAGEIROS: " + passeio.getQtdePassageiros());
      System.out.println("\n-------------------------------\n MOTOR \n-------------------------------\nQTDE DE PISTÕES: "+ passeio.getMotor().getQtdPistoes()+ "\nPOTÊNCIA: " + passeio.getMotor().getPotencia());
      System.out.println("DATA DE CADASTRO: " + passeio.getDataCadastro());
      System.out.println("A quantidade de letras em todos os atributos do tipo String é: " + passeio.calcular());
    } 
    else {
      if (alt == 2) {
        carga.getMotor().setPotencia(Integer.parseInt(leitura.entDados("\nPotência do motor: ")));
        carga.getMotor().setQtdPistoes(Integer.parseInt(leitura.entDados("Quantidade de pistões do motor: ")));
        carga.setCor(leitura.entDados("Cor do veículo: "));
        carga.setDataCadastro(leitura.entDados("Data do cadastro: "));
        carga.setMarca(leitura.entDados("Marca: "));
        carga.setModelo(leitura.entDados("Modelo: "));
        carga.setPlaca(leitura.entDados("Placa: "));
        carga.setQtdRodas(Integer.parseInt(leitura.entDados("Quantidade de rodas: ")));
        carga.setVelocMax(Integer.parseInt(leitura.entDados("Velocidade máxima em km/h: ")));
        if (carga.getVelocMax() > 250 || passeio.getVelocMax() < 10) {
          System.out.println("Velocidade máxima fora dos limites brasileiros... Alterando valor para 100 km/h");
          carga.setVelocMax(100);
        }
        carga.setTara(Integer.parseInt(leitura.entDados("\nDigite a quantidade da tara:")));
        carga.setCargaMax(Integer.parseInt(leitura.entDados("Digite o valor da carga máxima:")));
        System.out.println("\nEspecificações do veículo:\nPLACA: " + carga.getPlaca() + "\nMARCA: " + carga.getMarca());
        System.out.println("MODELO: " + carga.getModelo() + "\nCOR: " + carga.getCor());
        System.out.println("QTDE RODAS: " + carga.getQtdRodas() + "\nVELOCIDADE MÁX: " + carga.calcVel() + " cm/h");
        System.out.println("TARA: " + carga.getTara() + "\nCARGA MÁXIMA: " + carga.getCargaMax());
        System.out.println("\n-------------------------------\n MOTOR \n-------------------------------\nQTDE DE PISTÕES: "+ carga.getMotor().getQtdPistoes()+ "\nPOTÊNCIA - " + carga.getMotor().getPotencia());
        System.out.println("DATA DE CADASTRO: " + carga.getDataCadastro());
        System.out.println("O valor da soma de todos os atributos do tipo int é: " + carga.calcular());
      } 
    else {
        System.out.println("Alternativa incorreta.");
      }
    }
  }
}
