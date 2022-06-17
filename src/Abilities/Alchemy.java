package Abilities;

public class Alchemy extends Ability {
    private Ability ability;

    public Alchemy(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String printAbilities() {
        if (!ability.printAbilities().contains("[Alchemy]")) {
            return ability.printAbilities() + "[Alchemy]";
        } else
            return ability.printAbilities();
    }
}
