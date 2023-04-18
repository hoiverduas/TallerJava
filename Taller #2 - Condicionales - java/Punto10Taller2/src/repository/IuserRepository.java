package repository;

import entity.User;

import java.util.Arrays;

public interface IuserRepository {


    User getByRefID(String nombreUsuario);


}
