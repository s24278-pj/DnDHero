package Abilities;

public class GreatAxeProficiency extends Ability {
    private Ability ability;

    public GreatAxeProficiency(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String printAbilities() {
        if (!ability.printAbilities().contains("[Great Axe Proficiency]")) {
            return ability.printAbilities() + "[Great Axe Proficiency]";
        } else
            return ability.printAbilities();
    }
}
