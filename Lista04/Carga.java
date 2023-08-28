//Nome: Tiago Eloy Possidonio - RA: 2417677
public final class Carga extends Veiculo implements Calc {

  private int tara;
  private int cargaMax;

  public Carga() {
    tara = 0;
    cargaMax = 0;
  }

  public Carga(int tara, int cargaMax) {
    this.tara = tara;
    this.cargaMax = cargaMax;
  }

  public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor,
      String dataCadastro, int tara, int cargaMax) {
    super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
    this.tara = tara;
    this.cargaMax = cargaMax;
  }

  public final int getTara() {
    return tara;
  }

  public final void setTara(int tara) {
    this.tara = tara;
  }

  public final int getCargaMax() {
    return cargaMax;
  }

  public final void setCargaMax(int cargaMax) {
    this.cargaMax = cargaMax;
  }

  @Override
  public final int calcVel() {
    return getVelocMax() * 100000;
  }

  @Override
  public final int calcular() {
    return getQtdRodas() + getVelocMax() + getMotor().getQtdPistoes() + getMotor().getPotencia() + getTara()
        + getCargaMax();
  }
}
