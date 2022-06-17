package Abilities;

public class MendingInventory extends Ability {
    private Ability ability;

    public MendingInventory(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String printAbilities() {
        if (!ability.printAbilities().contains("[Mending Inventory]")) {
            return ability.printAbilities() + "[Mending Inventory]";
        } else
            return ability.printAbilities();
    }
}
