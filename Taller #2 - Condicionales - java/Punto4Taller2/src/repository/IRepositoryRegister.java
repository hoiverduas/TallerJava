package repository;

import entity.Register;

public interface IRepositoryRegister {

    void save(Register register);
    Register getByID(Integer id);
}
