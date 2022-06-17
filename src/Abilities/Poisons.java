package Abilities;

public class Poisons extends Ability {
    private Ability ability;

    public Poisons(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String printAbilities() {
        if (!ability.printAbilities().contains("[Poisons]")) {
            return ability.printAbilities() + "[Poisons]";
        } else
            return ability.printAbilities();
    }
}
