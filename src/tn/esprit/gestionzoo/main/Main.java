package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.ZooFullException;
import tn.esprit.gestionzoo.entities.invalideAgeException;

public class Main {

    public static void main(String[] args) {
        Zoo z = new Zoo("myZoo", "tunis");
        Animal[] aAjouter = {
                new Animal("mammiferes", "vache", 3, true),
                new Animal("felins", "lion", -2, true),       // âge invalide
                new Animal("vertebre", "singe", 5, true),
                new Animal("oiseaux", "aigle", 4, false),
                new Animal("reptiles", "croco", 7, false)     // le zoo sera plein
        };
        for (int i = 0; i < aAjouter.length; i++) {
            try {
                z.addAnimal(aAjouter[i]);
                System.out.println("Ajout reussi : " + aAjouter[i]);
            } catch (ZooFullException e) {
                System.out.println("Erreur : " + e.getMessage());
            } catch (invalideAgeException e) {
                System.out.println("Erreur : " + e.getMessage());
            } finally {
                System.out.println("Nombre d'animaux : " + z.getAnimalCount());
            }
        }
    }
}