package tn.esprit.gestionzoo.entities;

public class AnimauxTerrestres extends Animal{
 protected int nbrLegs;
  public AnimauxTerrestres(){}
  public AnimauxTerrestres(String family,String name,int age,boolean isMammal,int nbrLegs)
  {
    super(family,name,age,isMammal);
    this.nbrLegs=nbrLegs;
  }
  @Override
  public String toString() {
    return "Terrestrial [famille=" + family + ", nom=" + name + ", age=" + age
            + ", mammifere=" + isMammal + ", pattes=" + nbrLegs + "]";
  }

}
