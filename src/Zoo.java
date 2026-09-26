public class Zoo {
    Animal[] animals;
    String name ;
    String city;
    int nbrCages;
    public Zoo(){}
    public Zoo(String name,String city,int nbrCages){
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
        animals= new Animal[25];
    }
    public void displayZoo()
    {
        System.out.println("le nom du zoo est:"+name );
        System.out.println("la ville du zoo est:"+city );
        System.out.println("le nombres de cages du zoo est:"+nbrCages );
    }
public void tostring()
{
    
}
    public static void main(String[] args) {


    }
}
