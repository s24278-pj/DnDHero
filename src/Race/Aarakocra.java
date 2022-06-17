package Race;

public class Aarakocra extends Hero {
    private final String race = "Aarakocra";
    private String raceAbility = "Flying, Damage vulnerability";

    public Aarakocra(String name) {
        super(name);
        this.raceAbility = raceAbility;
    }

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
