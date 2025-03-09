package makehippo;

public class MakeHippo {
    public static void main(String[] args){
        Hippo h = new Hippo("Buffy");
        new MakeHippo().printName(h);
    }

    public void printName(Animal animal){
        System.out.println(animal.getName());

    }
}
