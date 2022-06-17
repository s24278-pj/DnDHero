package Abilities;

public class RangedWeaponsProficiency extends Ability {
    private Ability ability;

    public RangedWeaponsProficiency(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String printAbilities() {
        if (!ability.printAbilities().contains("[Range Weapons Proficiency]")) {
            return ability.printAbilities() + "[Range Weapons Proficiency]";
        } else
            return ability.printAbilities();
    }
}
