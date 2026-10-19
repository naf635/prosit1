package tn.esprit.gestionzoo.entities;

public class Penguin extends AnimauxAquatiques{
 protected   float swimmingDepth;
    public Penguin() {
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin(float swimmingDepth)
    {
        this.swimmingDepth=swimmingDepth;
    }
    public float getSwimmingDepth(){
        return swimmingDepth;
    }
    @Override
    public String toString() {
        return "Penguin [famille=" + family + ", nom=" + name + ", age=" + age
                + ", mammifere=" + isMammal + ", habitat=" + habitat
                + ", profondeur de nage=" + swimmingDepth + "]";
    }
}
