package model;

import java.util.Scanner;

public class ConsoleDataReader {

    private Scanner scanner = new Scanner(System.in);

    public Movie createMovie() {
        System.out.println("Dodawanie filmu:");
        System.out.print("Podaj tytuł: ");
        String movieTitle = scanner.nextLine();
        System.out.print("Podaj reżysera: ");
        String movieDirector = scanner.nextLine();
        System.out.print("Podaj rok produkcji: ");
        int movieProductionYear = scanner.nextInt(); scanner.nextLine();
        if (movieProductionYear < 0){
            System.out.println("Obiektu nie udało się utworzyć.");
            return null;
        }
        System.out.print("Podaj nazwę gatunku: ");
        String movieGenre = scanner.nextLine();
        System.out.print("Podaj opis: ");
        String movieDescription = scanner.nextLine();
        System.out.print("Podaj ocenę: ");
        int movieRating = scanner.nextInt(); scanner.nextLine();
        if (movieRating < 0 || movieRating > 6){
            System.out.println("Obiektu nie udało się utworzyć.");
            return null;
        }
        System.out.println();
        Movie movie = new Movie(movieTitle, movieDirector, movieProductionYear, movieGenre, movieDescription, movieRating);
        return movie;
    }

    public Series createTvSeries() {
        System.out.println("Dodawanie serialu:");
        System.out.print("Podaj tytuł: ");
        String seriesTitle = scanner.nextLine();
        System.out.print("Podaj liczbę sezonów: ");
        int numberOfSeasons = scanner.nextInt();
        if (numberOfSeasons < 0) {
            System.out.println("Obiektu nie udało się utworzyć.");
            return null;
        }
        System.out.print("Podaj liczbę odcinków: ");
        int numberOfEpisodes = scanner.nextInt(); scanner.nextLine();
        if (numberOfEpisodes < 0) {
            System.out.println("Obiektu nie udało się utworzyć.");
            return null;
        }
        System.out.print("Podaj nazwę producenta: ");
        String seriesProducer = scanner.nextLine();
        System.out.print("Podaj nazwę gatunku: ");
        String seriesGenre = scanner.nextLine();
        System.out.print("Podaj opis: ");
        String seriesDescription = scanner.nextLine();
        System.out.print("Podaj ocenę: ");
        int seriesRating = scanner.nextInt(); scanner.nextLine();
        if (seriesRating < 0 || seriesRating > 6){
            System.out.println("Obiektu nie udało się utworzyć.");
            return null;
        }
        System.out.println();
        Series series = new Series(seriesTitle, numberOfSeasons, numberOfEpisodes, seriesProducer, seriesGenre, seriesDescription, seriesRating);
        return series;
    }

    public Actor createActor(){
        System.out.println("Dodawanie aktora:");
        System.out.print("Podaj imię: ");
        String actorName = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        String actorSurname = scanner.nextLine();
        System.out.print("Podaj kraj pochodzenia: ");
        String countryOfBirth = scanner.nextLine();
        System.out.println();
        Actor actor = new Actor(actorName, actorSurname, countryOfBirth);
        return actor;
    }

}