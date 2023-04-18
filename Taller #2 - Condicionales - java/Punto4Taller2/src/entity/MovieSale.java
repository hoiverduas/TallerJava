package entity;

import java.util.List;

public class MovieSale {

    private List<Movie> movies;
    private int totalPrice;

    public MovieSale(List<Movie> movies, int totalPrice) {
        this.movies = movies;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "MovieSale{" +
                "movies=" + movies +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
