package Abilities;

public class SwordProficiency extends Ability {
    private Ability ability;

    public SwordProficiency(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String printAbilities() {
        if (!ability.printAbilities().contains("[Sword Proficiency]")) {
            return ability.printAbilities() + "[Sword Proficiency]";
        } else
            return ability.printAbilities();
    }
}
