package repository;

import entity.User;

import java.util.Map;

public class UserRepository implements IuserRepository {

    Map<String, User> usersDB = Map.of(
            "Hoiver", new User("123-564345-56","1234","Hoiver",100000),
            "Duas", new User("495-251621-34","4567","Duas",200000),
            "Daniel", new User("103-223444-12","0000","Daniel",300000)
    );


    public Map<String, User> getUsersDB() {
        return usersDB;
    }

    public void setUsersDB(Map<String, User> usersDB) {
        this.usersDB = usersDB;
    }

    @Override
    public User getByRefID(String nombreUsuario) {
        return usersDB.get(nombreUsuario);
    }




}
