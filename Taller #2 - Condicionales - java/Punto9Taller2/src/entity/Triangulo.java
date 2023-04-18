package entity;

public class Triangulo {
    private Double base;
    private Double altura;
    private Double respuesta;

    public Triangulo(Double base, Double altura, Double respuesta) {
        this.base = base;
        this.altura = altura;
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", respuesta=" + respuesta +
                '}';
    }
}
