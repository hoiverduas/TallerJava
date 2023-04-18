package repository;

import entity.Register;

import java.util.Map;

public class RegisterRepository implements IRegisterRepository {

    int capacidadMaxima = 3;
    Map<String, Register> registersDB = new java.util.HashMap<>(capacidadMaxima);

    @Override
    public void save(Register register) {

        if (registersDB.size() < capacidadMaxima) {


            if (registersDB.containsKey(register.getRegisterID())) {

                System.out.println("El registro con las siguientes caracteristicas  ya existe en la base de datos");
                System.out.println(register.getRegisterID());

            } else {

                registersDB.put(register.getRegisterID(), register);
            }

        } else {
            System.out.println("Error: se ha excedido la capacidad maxima de la base de dato.");
            System.out.println("El usuario con  las siguientes caracteristicas no fue guardado.");
        }

    }


    public void remove(Register register) {
        registersDB.remove(register.getRegisterID(), register);
    }

    @Override
    public Register getByID(String id) {
        return registersDB.get(id);
    }






}
