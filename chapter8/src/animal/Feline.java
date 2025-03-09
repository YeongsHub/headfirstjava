package animal;

public abstract class Feline extends Animal{

    private String name;

    public Feline(){

    }

    public Feline(String name) {
        this.name = name;
    }
    @Override
    void roam() {
        System.out.println("feline roam");
    }
}
