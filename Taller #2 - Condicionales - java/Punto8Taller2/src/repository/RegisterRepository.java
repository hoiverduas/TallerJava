package repository;

import entity.Register;

import java.util.Map;

public class RegisterRepository implements  IRegisterRepository{

    Map<Integer, Register> registersDB = new java.util.HashMap<>();

    @Override
    public void save(Register register) {
        registersDB.put(register.getRegisterID(), register);

    }

    public Map<Integer, Register> getRegistersDB() {
        return registersDB;
    }

    @Override
    public Register getByID(Integer id) {
        return registersDB.get(id);
    }
}
