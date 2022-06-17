package Professions;

import Abilities.MendingInventory;
import Race.Hero;

public class Armourer implements Profession{

   @Override
    public void addAbilities(Hero hero) {
    hero.addProfession("Armourer");

    MendingInventory mending = new MendingInventory(hero.getAbilities());
        hero.setAbilities(mending);
   }
}
