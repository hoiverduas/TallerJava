package entity;

public class Register {

    private User user;

    private Operator opeador;
    private Integer registerID;

    private  MovieSale movieSale;

    private Observations observations;

    public Register(User user, Operator opeador, Integer registerID) {
        this.user = user;
        this.opeador = opeador;
        this.registerID = registerID;
    }

    public Integer getRegisterID() {
        return registerID;
    }

    public void setMovieSale(MovieSale movieSale) {
        this.movieSale = movieSale;
    }

    public void setRegisterID(Integer registerID) {
        this.registerID = registerID;
    }

    public Observations getObservations() {
        return observations;
    }

    public void setObservations(Observations observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "Register{" +
                "user=" + user +
                ", opeador=" + opeador +
                ", registerID=" + registerID +
                ", movieSale=" + movieSale +
                ", observations=" + observations +
                '}';
    }


}
