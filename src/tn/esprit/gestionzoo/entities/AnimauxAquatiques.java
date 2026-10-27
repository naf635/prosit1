package tn.esprit.gestionzoo.entities;

public non-sealed abstract class AnimauxAquatiques extends Animal {
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
    public abstract void swim();
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof AnimauxAquatiques aq) {
            return name.equals(aq.name) && age == aq.age && habitat.equals(aq.habitat);
        }
        return false;
    }

}
