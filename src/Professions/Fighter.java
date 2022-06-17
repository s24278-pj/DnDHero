package Professions;

import Abilities.*;
import Race.Hero;

public class Fighter implements Profession{

    @Override
    public void addAbilities(Hero hero) {
        hero.addProfession("Fighter");

        MeleeAdvantage melee = new MeleeAdvantage(hero.getAbilities());
        hero.setAbilities(melee);

        SwordProficiency sword = new SwordProficiency(hero.getAbilities());
        hero.setAbilities(sword);

        GreatAxeProficiency axe = new GreatAxeProficiency(hero.getAbilities());
        hero.setAbilities(axe);

        SpearProficiency spear = new SpearProficiency(hero.getAbilities());
        hero.setAbilities(spear);

    }
}
