package Professions;

import Abilities.MeleeAdvantage;
import Abilities.Poisons;
import Abilities.Stealth;
import Race.Hero;

public class Rogue implements Profession {

    @Override
    public void addAbilities(Hero hero) {
        hero.addProfession("Rogue");

        Stealth stealth = new Stealth(hero.getAbilities());
        hero.setAbilities(stealth);

        Poisons poisons = new Poisons(hero.getAbilities());
        hero.setAbilities(poisons);

        MeleeAdvantage melee = new MeleeAdvantage(hero.getAbilities());
        hero.setAbilities(melee);
    }
}
