package entity;

public class Observation {
    private String inputObservations;
    private String outputObservations;

    public void SetOutputObservations(String outputObservations){
        this.outputObservations = outputObservations;
    }
    public Observation(String inputObservations){
        this.inputObservations = inputObservations;
    }

    @Override
    public String toString() {
        return "Observation{" +
                "inputObservations='" + inputObservations + '\'' +
                ", outputObservations='" + outputObservations + '\'' +
                '}';
    }
}
