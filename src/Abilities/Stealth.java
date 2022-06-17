package Abilities;

public class Stealth extends Ability {
    private Ability ability;

    public Stealth(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String printAbilities() {
        if (!ability.printAbilities().contains("[Stealth]")) {
            return ability.printAbilities() + "[Stealth]";
        } else
            return ability.printAbilities();
    }
}
