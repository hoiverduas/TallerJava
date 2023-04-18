package repository;

import entity.Register;

import java.util.Map;

public class RegisterRepository implements IRegisterRepository {
    Map<Integer, Register> registersDB = new java.util.HashMap<>();

    @Override
    public void save(Register register) {
        registersDB.put(register.getRegisterID(), register);
    }

    @Override
    public Register getByID(Integer id) {
        return registersDB.get(id);
    }
}
