import Professions.*;
import Race.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner nameObj = new Scanner(System.in);

        System.out.println("Hero name: ");
        String heroName;

        heroName = nameObj.nextLine();
        int race;
        Hero hero = null;
        do {
            System.out.println("Choose race (type number):\n1. Aarakocra\n2. Dwarf\n3. Elf\n4. Human ");
            race = nameObj.nextInt();

            int a = 1;
            int b = 2;
            int c = 3;
            int d = 4;

            if (race == 1) {
                hero = new Aarakocra(heroName);
            }
            else if (race == 2) {
                hero = new Dwarf(heroName);
            }
            else if (race == 3) {
                hero = new Elf(heroName);
            }
            else if (race == 4) {
                hero = new Human(heroName);
            } else {
                System.out.println("Choose correct number.\n");
            }
        } while (race != 1 && race != 2 && race != 3 && race != 4);

        int profession;
        do {
            System.out.println("Add profession (type number):\n1. Fighter\n2. Mage\n3. Rouge\n4. Hunter\n5. Armourer\n0. Continue");
            profession = nameObj.nextInt();

            if (profession == 1) {
                Fighter f = new Fighter();
                f.addAbilities(hero);
            }
            else if (profession == 2) {
                Mage m = new Mage();
                m.addAbilities(hero);
            }
            else if (profession == 3) {
                Rogue r = new Rogue();
                r.addAbilities(hero);
            }
            else if (profession == 4) {
                Hunter h = new Hunter();
                h.addAbilities(hero);
            }
            else if (profession == 5) {
                Armourer a = new Armourer();
                a.addAbilities(hero);
            }
            else if (profession == 0) {
                System.out.println("\nRise and Shine Hero!");
            }else {
                System.out.println("Choose correct number.\n");
            }
        } while (profession != 0);

        System.out.println("============================================================================================");
        System.out.println("Hero - " + hero.getName());
        System.out.println("Race - " + hero.getRace());
        System.out.println("Race abilities: " + hero.getRaceAbility());
        System.out.println("Hero professions: " + hero.getProfessions());
        System.out.println("Hero abilities: " + hero.getAbilities().printAbilities());
        System.out.println("============================================================================================");

    }
}