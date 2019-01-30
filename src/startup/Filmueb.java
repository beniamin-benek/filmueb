package startup;

import model.Actor;
import model.ConsoleDataReader;
import model.Movie;
import model.Series;

public class Filmueb {

    public static void main(String[] args) {

        String version = "0.2";
        System.out.println("Wersja " + version +"\n");
        ConsoleDataReader consoleDataReader = new ConsoleDataReader();

        Movie theRoom = consoleDataReader.createMovie();
        //Series myLittlePony = consoleDataReader.createTvSeries();
        Actor edwardNorton = consoleDataReader.createActor();

        //theRoom.printInfo();
        //myLittlePony.printInfo();
        //edwardNorton.printInfo();

    }
}