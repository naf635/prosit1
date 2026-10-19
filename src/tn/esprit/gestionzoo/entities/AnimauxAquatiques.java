package tn.esprit.gestionzoo.entities;

public class AnimauxAquatiques extends Animal {
   protected String habitat;
   public AnimauxAquatiques(){}
    public AnimauxAquatiques(String family,String name,int age,boolean isMammal,String habitat )
    {
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }
   @Override
   public String toString() {
       return "Aquatic [famille=" + family + ", nom=" + name + ", age=" + age
               + ", mammifere=" + isMammal + ", habitat=" + habitat + "]";
   }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

}
