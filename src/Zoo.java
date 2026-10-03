public class Zoo {

    String name ;
    String city;
    Animal[] animals;
   int nbrCages=25;
    int animalcount=0;
    public Zoo(String name, String city) {
        this.name=name;
        this.city=city;
        animals = new Animal[nbrCages];
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
            System.out.println("la famille est:"+animals[i].family);
            System.out.println("le nom est:"+animals[i].name);
            System.out.println("l'age est:"+animals[i].age);
            System.out.println("l'ismammal est:"+animals[i].isMammal);
        }
    }
    public int searchAnimal(Animal animal){

        for(int i =0;i<animalcount;i++)
        {
            if(animal.name.equals(animals[i].name))
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
        if (verif == -1 && animalcount<nbrCages) {
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
        return "Zoo [nom=" + name + ", ville=" + city + ", cages=" + nbrCages + ", animaux=" + animalcount + "]";
    }
    public static void main(String[] args) {


    }
}
