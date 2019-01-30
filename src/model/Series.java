package model;

public class Series {

    private String seriesTitle;
    private int numberOfSeasons;
    private int numberOfEpisodes;
    private String seriesProducer;
    private String seriesGenre;
    private String seriesDescription;
    private int seriesRating;

    public Series(String seriesTitle, int numberOfSeasons, int numberOfEpisodes, String seriesProducer, String seriesGenre, String seriesDescription, int seriesRating) {
        this.seriesTitle = seriesTitle;
        this.numberOfSeasons = numberOfSeasons;
        this.numberOfEpisodes = numberOfEpisodes;
        this.seriesProducer = seriesProducer;
        this.seriesGenre = seriesGenre;
        this.seriesDescription = seriesDescription;
        this.seriesRating = seriesRating;
    }

    public void printInfo() {
        System.out.printf("Serial:\n- Tytuł: %s\n- Liczba sezonów: %d\n- Liczba odcinków: %d\n- Producent: %s\n- Gatunek: %s\n- Opis: %s\n- Ocena: %d\n\n",
                getSeriesTitle(),getNumberOfSeasons(),getNumberOfEpisodes(),getSeriesProducer(),getSeriesGenre(),getSeriesDescription(),getSeriesRating());
    }

    public String getSeriesTitle() {
        return seriesTitle;
    }

    public void setSeriesTitle(String seriesTitle) {
        this.seriesTitle = seriesTitle;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getSeriesProducer() {
        return seriesProducer;
    }

    public void setSeriesProducer(String seriesProducer) {
        this.seriesProducer = seriesProducer;
    }

    public String getSeriesGenre() {
        return seriesGenre;
    }

    public void setSeriesGenre(String seriesGenre) {
        this.seriesGenre = seriesGenre;
    }

    public String getSeriesDescription() {
        return seriesDescription;
    }

    public void setSeriesDescription(String seriesDescription) {
        this.seriesDescription = seriesDescription;
    }

    public int getSeriesRating() {
        return seriesRating;
    }

    public void setSeriesRating(int seriesRating) {
        this.seriesRating = seriesRating;
    }
}