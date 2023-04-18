package repository;

import entity.Cake;

import java.util.Map;

public class CakeRepository implements ICakeRepository{

    Map<String, Cake> cakesDB = Map.of(

            "01", new Cake("01"," Torta - Arequipe", 20000,8),
            "02", new Cake("02"," Torta - Arequipe",40000,16),
            "03", new Cake("03"," Torta - Mora ",25000,8),
            "04", new Cake("04"," Torta - Mora ",50000,16),
            "05", new Cake("05"," Torta - Tres Leche",100000,8),
            "06", new Cake("06"," Torta - Tres Leche",200000,16)
    );

    @Override
    public Cake getByRefID(String refID) {
        return cakesDB.get(refID);
    }

    public Map<String, Cake> getCakesDB() {
        return cakesDB;
    }


}
