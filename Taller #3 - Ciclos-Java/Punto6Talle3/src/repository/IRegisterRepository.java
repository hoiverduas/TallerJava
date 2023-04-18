package repository;

import entity.Register;

public interface IRegisterRepository {
    void save(Register register);

    Register getByID(String id);

    void remove(Register register);





}