package repository;

import entity.Register;

import java.util.Map;

public class RegisterRepository implements IRegisterRepository {

    int capacidadMaxima = 8;
    Map<Integer, Register> registersDB = new java.util.HashMap<>(capacidadMaxima);

    @Override
    public void save(Register register) {

        if (registersDB.size() < capacidadMaxima) {

            registersDB.put(register.getRegisterID(), register);
        } else {
            System.out.println("Error: se ha excedido la capacidad maxima de la base de dato.");
            System.out.println("El usuario con  las siguientes caracteristicas no fue guardado.");
        }
    }

    @Override
    public Register getByID(Integer id) {
        return registersDB.get(id);
    }
}
