package Race;

public class Elf extends Hero {
    private final String race = "Elf";
    private String raceAbility = "Dark vision, Dexterity advantage";

    public Elf(String name) {
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
