package entity;

public class Calcular {

  private Rectángulo rectángulo;
  private Triangulo triangulo;
  private Trapecio trapecio;


  public Calcular(Trapecio trapecio) {
    this.trapecio = trapecio;
  }

  public Calcular(Triangulo triangulo) {
    this.triangulo = triangulo;
  }

  public Calcular(Rectángulo rectángulo) {
    this.rectángulo = rectángulo;
  }
}
