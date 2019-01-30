package model;

public class Movie {

    private String movieTitle;
    private String movieDirector;
    private int movieProductionYear;
    private String movieGenre;
    private String movieDescription;
    private int movieRating;

    public Movie(String movieTitle, String movieDirector, int movieProductionYear, String movieGenre, String movieDescription, int movieRating) {
        this.movieTitle = movieTitle;
        this.movieDirector = movieDirector;
        this.movieProductionYear = movieProductionYear;
        this.movieGenre = movieGenre;
        this.movieDescription = movieDescription;
        this.movieRating = movieRating;
    }

    public void printInfo() {
        System.out.printf("Film:\n- Tytuł: %s\n- Reżyser: %s\n- Rok produkcji: %d\n- Gatunek: %s\n- Opis: %s\n- Ocena: %d\n\n",
                getMovieTitle(),getMovieDirector(),getMovieProductionYear(),getMovieGenre(),getMovieDescription(),getMovieRating());
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public int getMovieProductionYear() {
        return movieProductionYear;
    }

    public void setMovieProductionYear(int movieProductionYear) {
        this.movieProductionYear = movieProductionYear;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

}