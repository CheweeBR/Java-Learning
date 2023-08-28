//Nome: Tiago Eloy Possidonio - RA: 2417677
public class Motor {

  private int qtdPistoes;
  private int potencia;

  public Motor() {
    qtdPistoes = 0;
    potencia = 0;
  }

  public Motor(int qtdPistoes, int potencia) {
    this.qtdPistoes = qtdPistoes;
    this.potencia = potencia;
  }

  public final int getQtdPistoes() {
    return qtdPistoes;
  }

  public final void setQtdPistoes(int qtdPistoes) {
    this.qtdPistoes = qtdPistoes;
  }

  public final int getPotencia() {
    return potencia;
  }

  public final void setPotencia(int potencia) {
    this.potencia = potencia;
  }

}
