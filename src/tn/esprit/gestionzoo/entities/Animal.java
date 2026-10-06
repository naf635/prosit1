package tn.esprit.gestionzoo.entities;

public class Animal {


 private   String family;
   private String name;
  private  int age;
   private boolean isMammal;
    public Animal(){}
    public Animal(String family,String name, int age, boolean isMammal)
    {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal [famille=" + family + ", nom=" + name + ", age=" + age + ", mammifere=" + isMammal + "]";
    }
    public String getName()
    {
        return name;
    }
    public String getFamily()
    {
        return family;
    }
    public int getAge()
    {
        return age;
    }

    public boolean getIsMammal()
    {
        return isMammal;
    }

    public void setAge(int age) {
        if(age<0) {
            System.out.println("le nom ne peut pas être négatif");
            return;
        }
        this.age = age;
    }
    public void setFamily(String family)
    {
        this.family=family;
    }
    public void setName(String name )
    {
        this.name =name;
    }
    public void setMammal(boolean isMammal )
    {
        this.isMammal=isMammal;
    }

    public static void main(String[] args) {


    }
}
