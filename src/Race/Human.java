package Race;

public class Human extends Hero {
    private final String race = "Human";
    String raceAbility = "None";

    public Human(String name) {
        super(name);
        this.raceAbility = raceAbility;
    }

    @Override
    public String getRaceAbility() {
        return raceAbility;
    }

    public void setRaceAbility(String raceAbility) {
        this.raceAbility = raceAbility;
    }

    public String getRace() {
        return race;
    }
}
