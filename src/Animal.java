public class Animal {


    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(){}
    public Animal(String family,String name, int age, boolean isMammal)
    {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    public String toString() {
        return "Animal [famille=" + family + ", nom=" + name + ", age=" + age + ", mammifere=" + isMammal + "]";
    }

    public static void main(String[] args) {


    }
}
