package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal("mamiferes", "vache", 3, true);
        Animal a2 = new Animal();
        Animal a1 = new Animal("vertébré", "verre de coco", 1, false);
        Animal a3 = new Animal("mamiferes", "vache", 3, true);   // identique à a

        Zoo z = new Zoo("myZoo", "tunis");
       AnimauxAquatiques aq = new AnimauxAquatiques("poissons", "requin", 6, false, "ocean");
        AnimauxTerrestres t = new AnimauxTerrestres("mammiferes", "vache", 3, true, 4);
        Dolphin d = new Dolphin("mammiferes", "flipper", 8, true, "mer", 40.5f);
        Penguin p = new Penguin("oiseaux", "pingu", 4, false, "bassin", 120.0f);

        System.out.println(aq);
        System.out.println(t);
        System.out.println(d);
        System.out.println(p);

        aq.swim();
        d.swim();
        p.swim();
        System.out.println("la vitesse est:"+d.getSmimmingSpeed());
        System.out.println("la profondeur max est:"+p.getSwimmingDepth());
        // Instructions 8 et 9 : affichage du zoo
        z.displayZoo();
        System.out.println(z);
        System.out.println(a);

        // Instruction 10 : ajout
        System.out.println("Ajout de a : " + z.addAnimal(a));
        System.out.println("Ajout de a1 : " + z.addAnimal(a1));
        z.afficherAnimaux();

        // Instruction 11 : recherche
        System.out.println("Recherche de a : " + z.searchAnimal(a));
        System.out.println("Recherche de a1 : " + z.searchAnimal(a1));
        System.out.println("Recherche de a3 (identique à a) : " + z.searchAnimal(a3));

        // Instruction 12 : unicité
        System.out.println("Ajout de a3 (doublon) : " + z.addAnimal(a3));

        // Instruction 13 : suppression
        System.out.println("Suppression de a : " + z.removeAnimal(a));
        System.out.println("Suppression de a (deuxième fois) : " + z.removeAnimal(a));
        z.afficherAnimaux();

        // Capacité maximale : on remplit le zoo
        for (int i = 0; i < 25; i++) {
            Animal nouveau = new Animal("test", "animal" + i, 1, true);
            if (z.addAnimal(nouveau) == false) {
                System.out.println("Ajout impossible pour animal" + i + " : zoo plein");
                break;
            }
        }

        // Instruction 15 : zoo plein et comparaison
        System.out.println("tn.esprit.gestionzoo.entities.Zoo plein ? " + z.isZooFull());
        System.out.println(z);

        Zoo z2 = new Zoo("zoo2", "sfax");
        z2.addAnimal(a);
        System.out.println("tn.esprit.gestionzoo.entities.Zoo plein (z2) ? " + z2.isZooFull());
        Zoo plusGrand = Zoo.comparerZoo(z, z2);
        System.out.println("Le plus grand zoo est : " + plusGrand.getName());
    }
}