//Nome: Tiago Eloy Possidonio - RA: 2417677
public final class Passeio extends Veiculo implements Calc {

  private int qtdePassageiros;

  public Passeio() {
    qtdePassageiros = 0;
  }

  public Passeio(int qtdePassageiros) {
    this.qtdePassageiros = qtdePassageiros;
  }

  public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor,
      String dataCadastro, int qtdePassageiros) {
    super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
    this.qtdePassageiros = qtdePassageiros;
  }

  public final int getQtdePassageiros() {
    return qtdePassageiros;
  }

  public final void setQtdePassageiros(int qtdePassageiros) {
    this.qtdePassageiros = qtdePassageiros;
  }

  @Override
  public final int calcVel() {
    return getVelocMax() * 1000;
  }

  @Override
  public final int calcular() {
    String letras = getPlaca() + getMarca() + getModelo() + getCor() + getDataCadastro();
    return letras.length();
  }
}
