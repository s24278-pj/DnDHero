package Race;

public class Dwarf extends Hero {
    private final String race = "Dwarf";
    private String raceAbility = "Dark vision, Constitution advantage";

    public Dwarf(String name) {
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
