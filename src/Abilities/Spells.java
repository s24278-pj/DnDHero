package Abilities;

public class Spells extends Ability {
    private Ability ability;

    public Spells(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String printAbilities() {
        if (!ability.printAbilities().contains("[Spells]")) {
            return ability.printAbilities() + "[Spells]";
        } else
            return ability.printAbilities();
    }
}
