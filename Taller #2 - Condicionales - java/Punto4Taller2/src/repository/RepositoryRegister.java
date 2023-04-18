package repository;

import entity.Register;

import java.util.Map;

public class RepositoryRegister implements IRepositoryRegister {

    Map<Integer, Register> registersDB = new java.util.HashMap<>();


    @Override
    public void save(Register register) {
        registersDB.put(register.getRegisterID(),register);
    }
    public Register getByID(Integer id){return registersDB.get(id);
    }
}
