package model;

public class Actor {

    private String actorName;
    private String actorSurname;
    private String countryOfBirth;

    public Actor(String actorName, String actorSurname, String countryOfBirth) {
        this.actorName = actorName;
        this.actorSurname = actorSurname;
        this.countryOfBirth = countryOfBirth;
    }

    public void printInfo(){
        System.out.printf("Aktor:\n- Imię: %s\n- Nazwisko: %s\n- Kraj pochodzenia: %s\n\n", getActorName(), getActorSurname(), getCountryOfBirth());
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorSurname() {
        return actorSurname;
    }

    public void setActorSurname(String actorSurname) {
        this.actorSurname = actorSurname;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

}