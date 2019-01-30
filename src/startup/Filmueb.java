package startup;

import model.Actor;
import model.Movie;
import model.Series;

public class Filmueb {

    public static void main(String[] args) {

        String version = "0.1";
        System.out.println("Wersja " + version +"\n");

        Movie theRoom = new Movie("The Room", "Tommy Wiseau", 2003, "melodramat", "Życie poczciwego bankiera zostaje wywrócone do góry nogami w momencie, gdy jego narzeczona zaczyna się spotykać z ich najlepszym przyjacielem.", 1);
        Series myLittlePony = new Series("My Little Pony: Przyjaźń to Magia", 9,26,"Hasbro","animacja", "Jednorożec Twilight Sparkle przybywa do Ponyville, by poznać magię i znaczenie przyjaźni.", 4);
        Actor edwardNorton = new Actor("Edward","Norton","USA");

        theRoom.printInfo();
        myLittlePony.printInfo();
        edwardNorton.printInfo();

    }
}
