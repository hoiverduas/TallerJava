package repository;

import entity.Tool;

public interface IToolRepository {
    Tool getByRefID(String refID);
}
