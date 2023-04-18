package repository;

import entity.Tool;

import java.util.Map;

public class ToolRepository implements IToolRepository {
    Map<String, Tool> toolsDB = Map.of(
            "01", new Tool("01", "BUJIA", 20000),
            "02", new Tool("02", "FILTRO MOTOR", 25000),
            "03", new Tool("03", "CARBURADOR", 100000)
    );

    @Override
    public Tool getByRefID(String refID) {
        return toolsDB.get(refID);
    }

}








