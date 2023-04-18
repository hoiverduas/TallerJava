package repository;

import entity.Cake;

public interface ICakeRepository {

    Cake getByRefID(String refID);


}
