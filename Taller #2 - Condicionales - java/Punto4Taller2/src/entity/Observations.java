package entity;

public class Observations {

    private String inputObservations;

    public Observations(String inputObservations) {
        this.inputObservations = inputObservations;
    }

    public String getInputObservations() {
        return inputObservations;
    }

    public void setInputObservations(String inputObservations) {
        this.inputObservations = inputObservations;
    }

    @Override
    public String toString() {
        return "Observations{" +
                "inputObservations='" + inputObservations + '\'' +
                '}';
    }
}
