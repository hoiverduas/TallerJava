package repository;

import entity.Movie;

import java.util.Map;

public interface IRepositoryMovie {

    Movie getByRefID(String refID);

}
