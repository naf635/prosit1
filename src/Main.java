public class Main {
    Animal a = new Animal("mamiferes","vache",3,true);
   Animal a2= new Animal();
    Animal a1 = new Animal( "vertébré","verre de coco",1,false);

    public static void main(String[] args) {
        Zoo z = new Zoo("myZoo","tunis",5);

        z.displayZoo();
        System.out.println(z);
        System.out.println(z.toString());
    }
}
