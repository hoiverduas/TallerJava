package repository;

import entity.Register;

public interface IRegisterRepository {
    void save(Register register);
    Register getByID(Integer id);
}
