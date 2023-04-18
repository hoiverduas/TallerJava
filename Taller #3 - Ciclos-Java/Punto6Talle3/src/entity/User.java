package entity;

public class User {

    private String apellidosComplete;

    public User(String apellidosComplete) {
        this.apellidosComplete = apellidosComplete;
    }

    public String getApellidosComplete() {
        return apellidosComplete;
    }

    public void setApellidosComplete(String apellidosComplete) {
        this.apellidosComplete = apellidosComplete;
    }

    @Override
    public String toString() {
        return "User{" +
                "apellidosComplete='" + apellidosComplete + '\'' +
                '}';
    }
}
