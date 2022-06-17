package Abilities;

public class MeleeAdvantage extends Ability {
    private Ability ability;

    public MeleeAdvantage(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String printAbilities() {
        if (!ability.printAbilities().contains("[Melee Advantage]")) {
            return ability.printAbilities() + "[Melee Advantage]";
        } else
            return ability.printAbilities();
    }
}
