package repository;

import entity.Movie;

import java.util.Map;
import java.util.Set;

public class RepositoryMovie  implements IRepositoryMovie {

    Map<String, Movie> moviesDB = Map.of(
            "01", new Movie("01", "JOHN WICK", " Accion, Crimen, Suspenso",20000),
            "02", new Movie("02", " EL EXORCISTA DEL PAPA", "Terror",50000),
            "03", new Movie("03", " SHAZAM LA FURIA DE LOS DIOSES", "Fantastico. Comedia. Accion.",10000)
    );




    @Override
    public Movie getByRefID(String refID) {
        return moviesDB.get(refID);
    }
}
