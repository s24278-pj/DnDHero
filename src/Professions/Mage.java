package Professions;

import Abilities.*;
import Race.Hero;

public class Mage implements Profession {

    @Override
    public void addAbilities(Hero hero) {
        hero.addProfession("Mage");

        Spells spells = new Spells(hero.getAbilities());
        hero.setAbilities(spells);

        Alchemy alchemy = new Alchemy(hero.getAbilities());
        hero.setAbilities(alchemy);
    }
}
