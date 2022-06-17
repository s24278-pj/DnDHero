package Race;

import Abilities.Ability;

import java.util.ArrayList;
import java.util.List;

public abstract class Hero {
    protected String race;
    protected String name;
    protected List<String> professions;
    protected Ability abilities;

    public Hero(String name) {
        this.name = name;
        this.abilities = new Ability();
        this.professions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ability getAbilities() {
        return abilities;
    }

    public void setAbilities(Ability ability) {
        this.abilities = ability;
    }

    public void addProfession(String prof) {
        if (!professions.contains(prof)){
            this.professions.add(prof);}
    }

    public List<String> getProfessions() {
        return professions;
    }

    public abstract String getRace();
    public abstract String getRaceAbility();
}
