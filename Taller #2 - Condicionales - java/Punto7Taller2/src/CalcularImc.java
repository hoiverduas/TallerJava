public class CalcularImc {

    public Double calcularIMC(Persona persona) {
        return persona.getPeso() / (persona.getEstatura() * persona.getEstatura());
    }


}
