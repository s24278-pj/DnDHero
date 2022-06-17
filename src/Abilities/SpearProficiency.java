package Abilities;

public class SpearProficiency extends Ability {
    private Ability ability;

    public SpearProficiency(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String printAbilities() {
        if (!ability.printAbilities().contains("[Spear Proficiency]")) {
            return ability.printAbilities() + "[Spear Proficiency]";
        } else
            return ability.printAbilities();
    }
}
