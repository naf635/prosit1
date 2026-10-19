package tn.esprit.gestionzoo.entities;

public class Dolphin extends AnimauxAquatiques{
     protected float swimmingSpeed;
    public Dolphin() {
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }


    public float getSmimmingSpeed(){
        return swimmingSpeed;
    }
    @Override
    public String toString() {
        return "Dolphin [famille=" + family + ", nom=" + name + ", age=" + age
                + ", mammifere=" + isMammal + ", habitat=" + habitat
                + ", vitesse de nage=" + swimmingSpeed + "]";
    }
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
