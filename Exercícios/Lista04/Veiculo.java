//Nome: Tiago Eloy Possidonio - RA: 2417677
public abstract class Veiculo {
  private String placa;
  private String marca;
  private String modelo;
  private String cor;
  private int qtdRodas;
  private int velocMax;
  private Motor motor;
  private String dataCadastro;

  public Veiculo() {
    placa = "aaa000";
    marca = "xxxxxx";
    modelo = "xxxxxx";
    cor = "xxxxxx";
    qtdRodas = 0;
    velocMax = 0;
    motor = new Motor();
    dataCadastro = "00/00/0000";
  }

  public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor,
      String dataCadastro) {
    this.placa = placa;
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.qtdRodas = qtdRodas;
    this.velocMax = velocMax;
    this.motor = motor;
    this.dataCadastro = dataCadastro;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getQtdRodas() {
    return qtdRodas;
  }

  public void setQtdRodas(int qtdRodas) {
    this.qtdRodas = qtdRodas;
  }

  public int getVelocMax() {
    return velocMax;
  }

  public void setVelocMax(int velocMax) {
    this.velocMax = velocMax;
  }

  public Motor getMotor() {
    return motor;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  public String getDataCadastro() {
    return dataCadastro;
  }

  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  public abstract int calcVel();
}