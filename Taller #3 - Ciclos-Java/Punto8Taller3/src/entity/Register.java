package entity;

public class Register {

    private User user;
    private Integer registerID;
    private String results;

    public Register(User user, Integer registerID) {
        this.user = user;
        this.registerID = registerID;
    }

    public Integer getRegisterID() {
        return registerID;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Register{" +
                "user=" + user +
                ", registerID=" + registerID +
                ", results='" + results + '\'' +
                '}';
    }
}
