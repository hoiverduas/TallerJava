package repository;

import entity.Register;

public interface IRegisterRepository {
    void save(Register register);
    void remove(Register register);
    Register getByID(Integer id);
}
