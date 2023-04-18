package entity;

public class Movie {

    private  String refID;
    private  String title;
    private String movieGenero;
    private Integer price;

    public Movie(String refID, String title, String movieGenero, Integer price) {
        this.refID = refID;
        this.title = title;
        this.movieGenero = movieGenero;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "refID='" + refID + '\'' +
                ", title='" + title + '\'' +
                ", movieGenero='" + movieGenero + '\'' +
                ", price=" + price +
                '}';
    }


}
