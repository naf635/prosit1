package tn.esprit.gestionzoo.entities;

public class Zoo {

   private String name ;
   private  String city;
    Animal[] animals;
    AnimauxAquatiques[] aquatiqueAnimals;
   final int nbrCages=25;
    int animalcount=0;
    int aquatiquecount=0;
    public Zoo(String name, String city) {
        this.name=name;
        this.city=city;
        animals = new Animal[nbrCages];
        aquatiqueAnimals=new AnimauxAquatiques[10];
    }
    public String getName()
    {
        return name;
    }
    public String getCity()
    {
        return city;
    }
    public void setName(String name)
    {
        if(name.isEmpty())
        {
            System.out.println("le nom du zoo est vide");
            return;
        }
        this.name=name;
    }
    public void setCity(String city)
    {
        this.city=city;
    }


    public void displayZoo()
    {
        System.out.println("le nom du zoo est:"+name );
        System.out.println("la ville du zoo est:"+city );
        System.out.println("le nombres de cages du zoo est:"+nbrCages );
    }


    public void afficherAnimaux()
    {
        for(int i=0;i<animalcount;i++) {
            System.out.println("la famille est:"+animals[i].getFamily());
            System.out.println("le nom est:"+animals[i].getName());
            System.out.println("l'age est:"+animals[i].getAge());
            System.out.println("l'ismammal est:"+animals[i].getIsMammal());
        }
    }
    public int searchAnimal(Animal animal){

        for(int i =0;i<animalcount;i++)
        {
            if(animal.getName().equals(animals[i].getName()))
            {
                return i;
            }

        }
        return -1;
    }
    public boolean removeAnimal(Animal animal)
    {

        int verif=searchAnimal(animal);
        if (verif!=-1) {
            for (int i = verif; i < animalcount-1; i++) {
                animals[i]=animals[i+1];

            }
            animals[animalcount-1]=null;
            animalcount--;
            return true;
        }
        return false;
    }
    public boolean isZooFull()
    {
        return animalcount == nbrCages;
    }
    public boolean addAnimal(Animal animal) {
        int verif = searchAnimal(animal);
        if (verif == -1 && !isZooFull()) {
            animals[animalcount] = animal;
            animalcount+=1;
            return true;
        }
        return false;

    }
   public static Zoo comparerZoo(Zoo z1,Zoo z2)
    {
            if(z1.animalcount>= z2.animalcount)
            {
                return z1;
            }
            return z2 ;
    }

    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo [nom=" + name + ", ville=" + city + ", cages=" + nbrCages + ", animaux=" + animalcount + "]";
    }
    public void AddAquatiqueAnimal(AnimauxAquatiques aquatique)
    {

            if (aquatiquecount<aquatiqueAnimals.length)
            {
          aquatiqueAnimals[aquatiquecount]=aquatique;
          aquatiquecount++;}

    }
    public void afficherAquatiqueAnimal()
    {
        for (int i = 0; i < aquatiquecount; i++) {
            aquatiqueAnimals[i].swim();
        }
    }
    public float maxPenguinDepth()
    {
        float max=0;
        for (int i = 0; i < aquatiquecount; i++) {
            if (aquatiqueAnimals[i] instanceof Penguin p) {
                if (p.getSwimmingDepth() > max) {
                    max=p.getSwimmingDepth();
                }

            }

        }
      return max;
    }
    public void displayNumberOfAquaticsByType() {
        int nbDolphins = 0;
        int nbPenguins = 0;
        for (int i = 0; i < aquatiquecount; i++) {
            if (aquatiqueAnimals[i] instanceof Dolphin) {
                nbDolphins++;
            } else if (aquatiqueAnimals[i] instanceof Penguin) {
                nbPenguins++;
            }
        }
        System.out.println("Nombre de dauphins : " + nbDolphins);
        System.out.println("Nombre de pingouins : " + nbPenguins);
    }
    public static void main(String[] args) {


    }

}
