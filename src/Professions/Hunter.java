package Professions;

import Abilities.*;
import Race.Hero;

public class Hunter implements Profession {

    @Override
    public void addAbilities(Hero hero) {
        hero.addProfession("Hunter");

        Stealth stealth = new Stealth(hero.getAbilities());
        hero.setAbilities(stealth);

        RangedWeaponsProficiency range = new RangedWeaponsProficiency(hero.getAbilities());
        hero.setAbilities(range);
    }
}
